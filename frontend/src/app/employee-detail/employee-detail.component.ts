import {Component, OnInit} from '@angular/core';
import {Employee} from '../domain/Employee';
import {ActivatedRoute, Router} from '@angular/router';
import {EmployeeService} from '../employee.service';

@Component({
  selector: 'app-employee-detail',
  templateUrl: './employee-detail.component.html',
  styleUrls: ['./employee-detail.component.scss']
})
export class EmployeeDetailComponent implements OnInit {
  employee: Employee;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private service: EmployeeService,
  ) {
  }

  ngOnInit() {
    this.employee = this.service.getCurrentEmployee();
    if (!this.employee) {
      this.service.calculateEmployeeByCode(this.route.snapshot.paramMap.get('code')).subscribe(employee => {
        console.log(employee);
        this.employee = employee;
      })
    }
  }

  goToNetwork() {
    this.router.navigate([`/network-chart/${this.employee.code}`]);
  }

}
