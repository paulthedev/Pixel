import { IonicModule } from '@ionic/angular';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MatrixComponent } from './matrix/matrix.component';
import { CanvasWhiteboardModule } from 'ng2-canvas-whiteboard';

import { ColorHueModule } from 'ngx-color/hue';
import { ColorShadeModule } from 'ngx-color/shade';

import { LightGridPageRoutingModule } from './light-grid-routing.module';

@NgModule({
  imports: [
    IonicModule,
    CommonModule,
    FormsModule,
    ColorHueModule,
    ColorShadeModule,
    CanvasWhiteboardModule,
    LightGridPageRoutingModule,
  ],
  declarations: [MatrixComponent],
})
export class LightGridPageModule {}
