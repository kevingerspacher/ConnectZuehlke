import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {EmployeeService} from "../employee.service";
import {switchMap} from "rxjs/operators";
import {Observable} from "rxjs";
import {Employee} from "../domain/Employee";
import * as Highcharts from "highcharts";
import * as HighchartsNetworkgraph from "highcharts/modules/networkgraph";

HighchartsNetworkgraph(Highcharts);

@Component({
  selector: 'app-network-chart',
  templateUrl: './network-chart.component.html',
  styleUrls: ['./network-chart.component.scss']
})
export class NetworkChartComponent implements OnInit {
  private employees$: Observable<Employee[]>;
  public isLoading;

  updateFromInput = false;
  Highcharts = Highcharts;
  chartConstructor = "chart";
  chartOptions = {
    chart: {
      type: "networkgraph",
      //height: "100%"
    },
    title: {
      text: "The Indo-European Laungauge Tree"
    },
    subtitle: {
      text: "A Force-Directed Network Graph in Highcharts"
    },
    plotOptions: {
      networkgraph: {
        keys: ["from", "to"],
        layoutAlgorithm: {
          enableSimulation: true
        },
        // link: {
        //   color: 'red',
        //   dowi: {marker: {radius: 10}}
        // },
      }
    },
    series: [
      {
        dataLabels: {
          enabled: true
        },
        data: []
      }
    ]
  };


  constructor(private route: ActivatedRoute, private router: Router, private service: EmployeeService) {

  }


  ngOnInit() {
    this.isLoading = true;
    this.employees$ = this.route.paramMap.pipe(
      switchMap((params: ParamMap) => this.service.getNetwork(params.get('code')))
    );

    this.createChartOptions();
  }

  createChartOptions() {
    this.employees$.subscribe(employees => {
      employees.forEach(employee => {
        this.chartOptions.series[0].data.push({from: 'dowi', to: employee.firstName, marker: {radius: 10}})
      });
      //this.chartOptions.plotOptions.networkgraph.link['dowi'] = {marker: {radius: 100}};
      this.isLoading = false;
    });

    Highcharts.setOptions({
      title: {
        style: {
          color: 'orange'
        }
      },
      plotOptions: {
        networkgraph: {
          marker: {
            radius: 5
          },
          link : {
            color: 'green'
          }
        }
      }
    });

  }
}
