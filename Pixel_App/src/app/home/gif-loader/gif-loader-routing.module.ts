import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { GifTypeSelectComponent } from './gif-type-select/gif-type-select.component';
import { SavedGifsComponent } from './saved-gifs/saved-gifs.component';
import { GiphyComponent } from './giphy/giphy.component';

const routes: Routes = [
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
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class GifLoaderPageRoutingModule {}
