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
  private currentEmployee: string;
  public isLoading;

  updateFromInput = false;
  Highcharts = Highcharts;
  chartConstructor = "chart";
  chartOptions = {
    chart: {
      type: "networkgraph",
    },
    title: {
      text: "Your Zühlke Network Graph"
    },
    subtitle: {
      text: "shows all your project colleagues!"
    },
    tooltip: {
      enabled: false
    },
    plotOptions: {
      networkgraph: {
        keys: ["from", "to"],
        layoutAlgorithm: {
          enableSimulation: true
        },
        color: '#9161a5',
        link: {
          color: '#000000'
        },
        nodes: []
      }
    },
    series: [
      {
        dataLabels: {
          enabled: true,
          inside: true,
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
      switchMap((params: ParamMap) => {
        this.currentEmployee = params.get('code');
        return this.service.getNetwork(this.currentEmployee)
      })
    );

    this.createChartOptions();
  }

  createChartOptions() {
    this.employees$.subscribe(employees => {
      employees.forEach(employee => {
        this.chartOptions.series[0].data.push({from: this.currentEmployee, to: employee.firstName, marker: {radius: 10}})
        this.chartOptions.plotOptions.networkgraph.nodes.push({
          id: this.currentEmployee,
          marker: {
            radius: 10
          },
          color: '#ec771b'
        })
      });
      this.isLoading = false;
    });

  }
}
