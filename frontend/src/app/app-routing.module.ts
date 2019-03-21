import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {EmployeeTableComponent} from './employee-table/employee-table.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {HackathonHeadlineComponent} from './hackathon-headline/hackathon-headline.component';
import {EmployeeDetailComponent} from './employee-detail/employee-detail.component';
import {MapComponent} from './map/map.component';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {AdminComponent} from "./admin/admin.component";

const routes: Routes = [
  {path: 'employees', component: EmployeeTableComponent},
  {path: 'customers', component: CustomerListComponent},
  {path: 'employee/:code', component: EmployeeDetailComponent},
  {path: 'welcome', component: HackathonHeadlineComponent},
  {path: 'map', component: MapComponent},
  {path: 'admin', component: AdminComponent},

  {path: '', redirectTo: '/welcome', pathMatch: 'full'},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
