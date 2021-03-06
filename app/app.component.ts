import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MonitorNew';
}

<mat-toolbar color="primary" class="app-header">
  <div><a href="#" target="_blank" class="positronx">Demo</a></div>
  <span class="nav-tool-items">
    <a mat-button routerLink="signin" routerLinkActive="active">Signin</a>
    <a mat-button mat-raised-button routerLink="register" routerLinkActive="active">Signup</a>
  </span>
</mat-toolbar>

<router-outlet></router-outlet>
