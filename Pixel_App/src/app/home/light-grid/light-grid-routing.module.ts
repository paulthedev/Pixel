import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LightGridPage } from './light-grid.page';

const routes: Routes = [
  {
    path: '',
    component: LightGridPage,
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LightGridPageRoutingModule {}
