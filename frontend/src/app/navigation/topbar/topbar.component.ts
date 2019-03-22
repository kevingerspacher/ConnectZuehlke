import {Component, EventEmitter, Output} from '@angular/core';
import {MatDialog, MatDialogConfig} from "@angular/material";
import {DialogInfoComponent} from "../../dialog-info/dialog-info.component";

@Component({
  selector: 'app-topbar',
  templateUrl: './topbar.component.html',
  styleUrls: ['./topbar.component.scss']
})
export class TopbarComponent {
  @Output() toggleSidbar = new EventEmitter();

  constructor(private dialog: MatDialog){
  }

  openDialog() {

    const dialogConfig = new MatDialogConfig();

    dialogConfig.disableClose = true;
    dialogConfig.autoFocus = true;

    dialogConfig.data = {
      id: 1,
      title: 'Predict the Leavers - INFO'
    };

    this.dialog.open(DialogInfoComponent, dialogConfig);
  }

  toggle() {
    this.toggleSidbar.emit();
  }
}
