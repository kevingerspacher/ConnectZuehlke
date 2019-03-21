import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {EmployeeService} from "../employee.service";
import {switchMap} from "rxjs/operators";
import {Observable} from "rxjs";
import {Employee} from "../domain/Employee";

@Component({
  selector: 'app-network-chart',
  templateUrl: './network-chart.component.html',
  styleUrls: ['./network-chart.component.scss']
})
export class NetworkChartComponent implements OnInit {
  private employees$: Observable<Employee[]>;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private service: EmployeeService,
  ) {
  }

  ngOnInit() {
    this.employees$ = this.route.paramMap.pipe(
      switchMap((params: ParamMap) => this.service.getNetwork(params.get('code')))
    );
  }

}
