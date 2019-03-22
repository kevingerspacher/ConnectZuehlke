import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {FontAwesomeModule} from '@fortawesome/angular-fontawesome';
import {faHeart} from '@fortawesome/free-solid-svg-icons';
import {faAngular, faJava} from '@fortawesome/free-brands-svg-icons';
import {intersectionObserverPreset, LazyLoadImageModule} from 'ng-lazyload-image';


import {library} from '@fortawesome/fontawesome-svg-core';
import {EmployeeTableComponent} from './employee-table/employee-table.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import {SearchPipe} from './search.pipe';
import {FormsModule} from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {
  MatButtonModule,
  MatCardModule,
  MatIconModule,
  MatInputModule,
  MatListModule,
  MatProgressSpinnerModule,
  MatSelectModule,
  MatSidenavModule,
  MatSnackBarModule,
  MatToolbarModule,
  MatTableModule,
  MatPaginatorModule,
  MatProgressBarModule, MatTooltipModule,
  MatDialogModule
} from '@angular/material';
import {NavigationComponent} from './navigation/navigation.component';
import {LayoutModule} from '@angular/cdk/layout';
import {HackathonHeadlineComponent} from './hackathon-headline/hackathon-headline.component';
import {SidebarComponent} from './navigation/sidebar/sidebar.component';
import {TopbarComponent} from './navigation/topbar/topbar.component';
import {EmployeeDetailComponent} from './employee-detail/employee-detail.component';
import {MapComponent} from './map/map.component';
import {AgmCoreModule} from '@agm/core';
import {CustomerListComponent} from './customer-list/customer-list.component';
import {CustomerComponent} from './customer-list/customer/customer.component';
import {ErrorRequestInterceptor} from './common/error-request-interceptor';
import {AdminComponent} from './admin/admin.component';
import {ProjectListComponent} from './project-list/project-list.component';
import {ProjectComponent} from './project-list/project/project.component';
import {NetworkChartComponent} from './network-chart/network-chart.component';
import {HighchartsChartModule} from "highcharts-angular";
import {DialogInfoComponent} from './dialog-info/dialog-info.component';


// For more icons, please checkout https://fontawesome.com/icons?d=gallery
library.add(faHeart);
library.add(faJava);
library.add(faAngular);


@NgModule({
  declarations: [
    AppComponent,
    EmployeeTableComponent,
    PageNotFoundComponent,
    SearchPipe,
    NavigationComponent,
    HackathonHeadlineComponent,
    SidebarComponent,
    TopbarComponent,
    EmployeeDetailComponent,
    MapComponent,
    CustomerListComponent,
    CustomerComponent,
    AdminComponent,
    ProjectListComponent,
    ProjectComponent,
    NetworkChartComponent,
    DialogInfoComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    FontAwesomeModule,
    LazyLoadImageModule.forRoot({
      preset: intersectionObserverPreset
    }),
    HttpClientModule,
    BrowserAnimationsModule,
    HighchartsChartModule,
    MatInputModule,
    MatCardModule,
    MatButtonModule,
    MatSelectModule,
    MatIconModule,
    MatProgressBarModule,
    MatTooltipModule,
    MatSnackBarModule,
    LayoutModule,
    MatToolbarModule,
    MatSidenavModule,
    MatListModule,
    MatTableModule,
    MatProgressSpinnerModule,
    MatPaginatorModule,
    MatDialogModule,
    AgmCoreModule.forRoot({apiKey: 'AIzaSyBrgp24CvFV3M0PZGByVDVEG0qn56k8Y-g'})
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS, useClass: ErrorRequestInterceptor, multi: true
    }
  ],
  bootstrap: [AppComponent],
  entryComponents: [DialogInfoComponent]
})
export class AppModule {
}
