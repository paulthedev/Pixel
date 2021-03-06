import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { GifLoaderPage } from './gif-loader.page';

import { GifTypeSelectComponent } from './gif-type-select/gif-type-select.component';
import { SavedGifsComponent } from './saved-gifs/saved-gifs.component';
import { GiphyComponent } from './giphy/giphy.component';

const routes: Routes = [
  {
    path: '',
    component: GifLoaderPage,
    children: [
      {
        path: 'type-select',
        component: GifTypeSelectComponent,
      },
      {
        path: 'saved',
        component: SavedGifsComponent,
      },
      {
        path: 'giphy',
        component: GiphyComponent,
      },
      {
        path: '',
        redirectTo: 'type-select',
      },
    ],
  },
  {
    path: '',
    redirectTo: '/gif/type-select',
    pathMatch: 'full',
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class GifLoaderPageRoutingModule {}
