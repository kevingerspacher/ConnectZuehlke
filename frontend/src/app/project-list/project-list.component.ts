import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {Project} from "../domain/Project";
import {ProjectService} from "../project.service";
import {fromEvent} from "rxjs";
import {debounceTime, distinctUntilChanged, filter, map} from "rxjs/operators";

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.scss']
})
export class ProjectListComponent implements OnInit {

  projects: Project[];
  @ViewChild('searchRef') searchRef: ElementRef;

  constructor(private projectService: ProjectService) { }

  ngOnInit() {
    fromEvent(this.searchRef.nativeElement, 'keyup').pipe(
      // get value
      map((e: any) => e.target.value),
      // text length must be > 2 chars
      filter(res => res.length > 2),
      // emit after 0.5s of silence
      debounceTime(500),
      // emit only if data changes since the last emit
      distinctUntilChanged())
      // subscription
      .subscribe((text: string) => this.getProjects(text));
  }

  private getProjects(title: string) {
    if (!title) {
      this.projects = [];
      return;
    }
    
    this.projectService
      .getProjectsBySearchTerm(title)
      .subscribe((projects) => {
        this.projects = projects;
      });
  }

}
