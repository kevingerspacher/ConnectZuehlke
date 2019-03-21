import {Component, OnInit, ViewChild} from '@angular/core';
import {EmployeeService} from '../employee.service';
import {Employee} from '../domain/Employee';
import {Router} from "@angular/router";
import {MatPaginator, MatTableDataSource} from "@angular/material";
import {Observable, of} from "rxjs";


@Component({
  selector: 'app-employee-table',
  templateUrl: './employee-table.component.html',
  styleUrls: ['./employee-table.component.scss']
})

export class EmployeeTableComponent implements OnInit {
  employees: Observable<Employee[]> = of([
    {id: 1, leaveProbability: 1, firstName: "2", lastName: "3", code: "2"},
    {id: 1, leaveProbability: 1, firstName: "2", lastName: "3", code: "2"},
    {id: 1, leaveProbability: 1, firstName: "2", lastName: "3", code: "2"},
    {id: 1, leaveProbability: 1, firstName: "2", lastName: "3", code: "2"},
    {id: 1, leaveProbability: 1, firstName: "2", lastName: "3", code: "2"},
    {id: 1, leaveProbability: 1, firstName: "2", lastName: "3", code: "2"},
    {id: 1, leaveProbability: 1, firstName: "2", lastName: "3", code: "2"},
    {id: 1, leaveProbability: 1, firstName: "2", lastName: "3", code: "2"},
  ]);
  searchQuery: string;
  displayedColumns: string[] = ['image', 'name', 'leaveProbability'];
  datasource: MatTableDataSource<Employee>;

  constructor(private employeeService: EmployeeService, private router: Router) {
  }

  @ViewChild(MatPaginator) paginator: MatPaginator;

  ngOnInit() {
    //this.getEmployees();
    this.employees.subscribe(employees => {
      this.datasource = new MatTableDataSource(employees);
      this.datasource.paginator = this.paginator;
    })
  }

  goToEmployeePage(employee: Employee)
  {
    this.router.navigate([`/employee/${employee.code}`]);
  }

  private getEmployees() {
    this.employeeService
      .getAllEmployees().
      subscribe(employees => {
      this.datasource = new MatTableDataSource(employees);
      this.datasource.paginator = this.paginator;
    });
  }

  search() {
    this.employees = of([]);
    //this.getEmployees();
  }
}
