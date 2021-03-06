import { IonicModule } from '@ionic/angular';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { GifLoaderPage } from './gif-loader.page';
import { GifLoaderPageRoutingModule } from './gif-loader-routing.module';

@NgModule({
  imports: [
    IonicModule,
    CommonModule,
    FormsModule,
    GifLoaderPageRoutingModule
  ],
  declarations: [GifLoaderPage]
})
export class GifLoaderPageModule {}
