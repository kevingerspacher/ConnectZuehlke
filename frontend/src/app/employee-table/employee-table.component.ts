import {Component, OnInit, ViewChild} from '@angular/core';
import {EmployeeService} from '../employee.service';
import {Employee} from '../domain/Employee';
import {Router} from "@angular/router";
import {MatPaginator, MatTableDataSource} from "@angular/material";


@Component({
  selector: 'app-employee-table',
  templateUrl: './employee-table.component.html',
  styleUrls: ['./employee-table.component.scss']
})

export class EmployeeTableComponent implements OnInit {
  displayedColumns: string[] = ['image', 'name', 'leavingPropability', 'actions'];
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

  // private getVisibleEmployees()
  // {
  //   this.datasource.paginator.page.subscribe((pageEvent: PageEvent) => {
  //     const startIndex = pageEvent.pageIndex * pageEvent.pageSize;
  //     const endIndex = startIndex + pageEvent.pageSize;
  //     const itemsShown = this.datasource.filteredData.slice(startIndex, endIndex);
  //
  //     //this.calculateLeaveProbability(itemsShown, startIndex);
  //   });
  // }

  private calculateProbability(employee: Employee){
    const index = this.datasource.data.indexOf(employee);
    this.employeeService.getAllCalculatedEmployees([employee]).subscribe((employee) => {
      const tempDataSource = this.datasource.data;
      tempDataSource[index] = employee[0];
      this.datasource.data = tempDataSource;
    });
  }

  // private calculateLeaveProbability(itemsShown: Employee[], startIndex: number){
  //   const leavingProbMap = itemsShown.map(employee => employee.leavingPropability);
  //   if(leavingProbMap.every(element => element !== null))
  //   {
  //     console.log("All values calculated!");
  //     return;
  //   }
  //   console.log("Calculating values.");
  //   this.employeeService.getAllCalculatedEmployees(itemsShown).subscribe((employee) => {
  //     for (let i = 0; i < employee.length; i++) {
  //       this.datasource.data[startIndex + i] = employee[i];
  //     }
  //     });
  // }

  private getEmployees() {
    this.employeeService
      .getAllEmployees().
      subscribe(employees => {
      this.datasource = new MatTableDataSource(employees);
      this.datasource.paginator = this.paginator;
      //this.getVisibleEmployees();
    });
  }

  applyFilter(filterValue: string) {
    this.datasource.filter = filterValue.trim().toLowerCase();
  }

}
