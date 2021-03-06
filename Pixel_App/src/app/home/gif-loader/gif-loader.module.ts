import { IonicModule } from '@ionic/angular';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { GifLoaderPageRoutingModule } from './gif-loader-routing.module';

import {GifTypeSelectComponent} from './gif-type-select/gif-type-select.component';
import {GiphyComponent} from './giphy/giphy.component';
import {SavedGifsComponent} from './saved-gifs/saved-gifs.component';

@NgModule({
  imports: [
    IonicModule,
    CommonModule,
    FormsModule,
    GifLoaderPageRoutingModule
  ],
  declarations: [GifTypeSelectComponent,GiphyComponent,SavedGifsComponent]
})
export class GifLoaderPageModule {}
