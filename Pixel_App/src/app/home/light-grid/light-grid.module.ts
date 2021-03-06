import { IonicModule } from '@ionic/angular';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { LightGridPage } from './light-grid.page';

import { LightGridPageRoutingModule } from './light-grid-routing.module';

@NgModule({
  imports: [
    IonicModule,
    CommonModule,
    FormsModule,
    LightGridPageRoutingModule
  ],
  declarations: [LightGridPage]
})
export class LightGridPageModule {}
