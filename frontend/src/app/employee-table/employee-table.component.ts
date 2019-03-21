import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../employee.service';
import {Employee} from '../domain/Employee';

@Component({
  selector: 'app-employee-table',
  templateUrl: './employee-table.component.html',
  styleUrls: ['./employee-table.component.scss']
})


export class EmployeeTableComponent implements OnInit {
  employees: Employee[] = [];
  searchQuery: string;
  displayedColumns: string[] = ['image', 'name', 'leaveProbability'];

  constructor(private employeeService: EmployeeService) {
  }

  ngOnInit() {
    this.getEmployees();
  }

  private getEmployees() {
    this.employeeService
      .getAllEmployees()
      .subscribe(employees => {
        employees.forEach(item => this.employees.push({firstName: item.firstName, lastName: item.lastName,
          code: item.code, id: item.id, leaveProbability: 0}));
      });
  }

  search() {
    this.employees = [];
    this.getEmployees();
  }
}
