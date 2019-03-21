import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {EmployeeTableComponent} from './employee-table.component';
import {FormsModule} from '@angular/forms';
import {SearchPipe} from '../search.pipe';
import {EmployeeService} from '../employee.service';
import {EmployeeServiceMock} from './employee.service-mock';
import {By} from '@angular/platform-browser';
import {DebugElement} from '@angular/core';
import {MatInputModule, MatListModule} from '@angular/material';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';
import {LazyLoadImageModule} from 'ng-lazyload-image';
import {RouterTestingModule} from '@angular/router/testing';

describe('EmployeeListComponent', () => {
  let component: EmployeeTableComponent;
  let fixture: ComponentFixture<EmployeeTableComponent>;
  let searchEl: DebugElement;
  let listEl: DebugElement;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        FormsModule,
        NoopAnimationsModule,
        MatInputModule,
        MatListModule,
        LazyLoadImageModule,
        RouterTestingModule,
      ],
      declarations: [
        EmployeeTableComponent,
        SearchPipe,
      ],
      providers: [
        {provide: EmployeeService, useClass: EmployeeServiceMock}
      ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    searchEl = fixture.debugElement.query(By.css('input'));
    listEl = fixture.debugElement.query(By.css('[data-id="employee-list"]'));
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should render two employees', () => {
    expect(listEl.children.length).toBe(2);
  });

  function searchList() {
    const inputElement = searchEl.nativeElement;

    inputElement.value = 'John';
    inputElement.dispatchEvent(new Event('input'));
    fixture.detectChanges();
  }

  it('should filter one employees', () => {
    searchList();

    expect(listEl.children.length).toBe(1);
  });
});
