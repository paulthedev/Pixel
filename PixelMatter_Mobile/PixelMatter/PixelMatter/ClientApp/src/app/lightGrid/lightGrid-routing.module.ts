import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { MatrixComponent } from './matrix/matrix.component'

const routes: Routes = [
    {
        path: '',
        component: MatrixComponent
    }, {
        path: 'matrix',
        component: MatrixComponent
    }];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class LightGridRoutingModule { }
