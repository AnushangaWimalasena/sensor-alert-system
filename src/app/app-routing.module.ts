import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {page} from './page/page.component';
import {account} from './account/account.component';
const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
const routes: Routes = [
  { path: 'page', component: page },
  { path: 'account', component: account },
];