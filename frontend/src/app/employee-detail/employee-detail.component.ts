import {Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs';
import {Employee} from '../domain/Employee';
import {switchMap} from 'rxjs/operators';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {EmployeeService} from '../employee.service';

@Component({
  selector: 'app-employee-detail',
  templateUrl: './employee-detail.component.html',
  styleUrls: ['./employee-detail.component.scss']
})
export class EmployeeDetailComponent implements OnInit {
  employee$: Observable<Employee>;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private service: EmployeeService,
  ) {
  }

  private code: string;

  ngOnInit() {
    this.employee$ = this.route.paramMap.pipe(
      switchMap((params: ParamMap) => {
        this.code = params.get('code');
        return this.service.getEmployee(this.code);
      })
    );
  }

  goToNetwork(){
    this.router.navigate([`/network-chart/${this.code}`]);  }

}
