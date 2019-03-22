import {Component, OnInit, ViewChild} from '@angular/core';
import {EmployeeService} from '../employee.service';
import {Employee} from '../domain/Employee';
import {Router} from "@angular/router";
import {MatPaginator, MatTableDataSource, PageEvent} from "@angular/material";


@Component({
  selector: 'app-employee-table',
  templateUrl: './employee-table.component.html',
  styleUrls: ['./employee-table.component.scss']
})

export class EmployeeTableComponent implements OnInit {
  displayedColumns: string[] = ['image', 'name', 'leavingPropability'];
  datasource: MatTableDataSource<Employee>;

  constructor(private employeeService: EmployeeService, private router: Router) {
  }

  @ViewChild(MatPaginator) paginator: MatPaginator;

  ngOnInit() {
    this.getEmployees();
  }

  goToEmployeePage(employee: Employee)
  {
    this.router.navigate([`/employee/${employee.code}`]);
  }

  private getVisibleEmployees()
  {
    this.datasource.paginator.page.subscribe((pageEvent: PageEvent) => {
      const startIndex = pageEvent.pageIndex * pageEvent.pageSize;
      const endIndex = startIndex + pageEvent.pageSize;
      const itemsShown = this.datasource.filteredData.slice(startIndex, endIndex);

      this.calculateLeaveProbability(itemsShown, startIndex);
    });
  }

  private calculateLeaveProbability(itemsShown: Employee[], startIndex: number){
    itemsShown.forEach(function (employee) {
      if(employee.leavingPropability){
        return;
      }
    });
    console.log("continue.");
    this.employeeService.getAllCalculatedEmployees(itemsShown).subscribe((employee) => {
      for (let i = 0; i < employee.length; i++) {
        this.datasource.data[startIndex + i] = employee[i];
      }
      });
  }

  private getEmployees() {
    this.employeeService
      .getAllEmployees().
      subscribe(employees => {
      this.datasource = new MatTableDataSource(employees);
      this.datasource.paginator = this.paginator;
      this.getVisibleEmployees();
    });
  }

  applyFilter(filterValue: string) {
    this.datasource.filter = filterValue.trim().toLowerCase();
  }

}
