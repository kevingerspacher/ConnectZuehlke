import {Component, OnInit, ViewChild} from '@angular/core';
import {EmployeeService} from '../employee.service';
import {Employee} from '../domain/Employee';
import {Router} from "@angular/router";
import {MatSort, MatPaginator, MatTableDataSource} from "@angular/material";


@Component({
  selector: 'app-employee-table',
  templateUrl: './employee-table.component.html',
  styleUrls: ['./employee-table.component.scss']
})

export class EmployeeTableComponent implements OnInit {
  searchQuery: string;
  displayedColumns: string[] = ['image', 'name', 'leavingProbability'];
  datasource: MatTableDataSource<Employee>;

  constructor(private employeeService: EmployeeService, private router: Router) {
  }

  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  ngOnInit() {
    this.getEmployees();
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
      this.datasource.sort = this.sort;
    });
  }

  search() {
    //this.employees = of([]);
    //this.getEmployees();
  }
}
