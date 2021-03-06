import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePage } from './home.page';

const routes: Routes = [
  {
    path: '',
    component: HomePage,
    children: [
      {
        path: 'light-grid',
        loadChildren: () => import('./light-grid/light-grid.module').then(m => m.LightGridPageModule)
      },
      {
        path: 'gif',
        loadChildren: () => import('./gif-loader/gif-loader.module').then(m => m.GifLoaderPageModule)
      },
      {
        path: '',
        redirectTo: '/home/light-grid',
        pathMatch: 'full'
      }
    ]
  },
  {
    path: '',
    redirectTo: '/home/light-grid',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
})
export class HomePageRoutingModule {}
