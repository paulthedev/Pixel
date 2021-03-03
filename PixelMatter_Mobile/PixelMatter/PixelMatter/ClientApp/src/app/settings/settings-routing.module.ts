import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { FindDevicesComponent } from './FindDevices/FindDevices.component';

const routes: Routes = [
    {
        path: '',
        component: FindDevicesComponent
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule],
})
export class SettingsRoutingModule { }
