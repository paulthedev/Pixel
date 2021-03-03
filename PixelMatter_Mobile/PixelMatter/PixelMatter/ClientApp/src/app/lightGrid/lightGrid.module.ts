import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LightGridComponent } from './lightGrid.component';
import { LightGridRoutingModule } from './lightGrid-routing.module';

@NgModule({
    imports: [
        CommonModule,
        LightGridRoutingModule
    ],
    declarations: [LightGridComponent]
})
export class LightGridModule { }
