import { Component, OnInit } from '@angular/core';
import {Project} from "../domain/Project";
import {ProjectService} from "../project.service";

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.scss']
})
export class ProjectListComponent implements OnInit {

  projects: Project[];
  searchQuery: string;

  constructor(private projectService: ProjectService) { }

  ngOnInit() {
    this.getProjects();
  }

  private getProjects() {
    this.projectService
      .getAllProjects()
      .subscribe((projects) => {
        this.projects = projects;
      });
  }

}
