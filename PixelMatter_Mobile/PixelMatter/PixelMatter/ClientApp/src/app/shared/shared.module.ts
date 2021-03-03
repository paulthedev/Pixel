import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MatIconModule } from '@angular/material/icon';
import { MatCardModule } from '@angular/material/card';
import { MatToolbarModule } from '@angular/material/toolbar';

const MatModules = [MatIconModule, MatCardModule, MatToolbarModule];

@NgModule({
    imports: [
        CommonModule,
        ...MatModules
    ],
    exports: [...MatModules],
    declarations: []
})
export class SharedModule { }
