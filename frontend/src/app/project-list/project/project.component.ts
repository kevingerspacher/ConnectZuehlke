import {Component, Input, OnInit} from '@angular/core';
import {Project} from "../../domain/Project";
import {ProjectService} from "../../project.service";

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.scss']
})
export class ProjectComponent implements OnInit {

  @Input() project: Project;

  constructor(private projectService: ProjectService) { }

  ngOnInit() {
  }

  setProjectMood(project: Project, mood: number) {
    project.mood = mood;
    this.projectService.saveProject(project).subscribe((project) => {this.project = project});
  }

}
