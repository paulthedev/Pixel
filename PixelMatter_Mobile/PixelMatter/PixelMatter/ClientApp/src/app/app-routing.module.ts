import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
    {
        path: '',
        loadChildren: () =>
            import('./lightGrid/lightGrid.module').then((m) => m.LightGridModule),
        pathMatch: 'full',
    },
    {
        path: 'lights',
        loadChildren: () =>
            import('./lightGrid/lightGrid.module').then((m) => m.LightGridModule),
        pathMatch: 'full',
    },
    {
        path: 'settings',
        loadChildren: () =>
            import('./settings/settings.module').then((m) => m.SettingsModule),
        pathMatch: 'full',
    },
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule],
})
export class AppRoutingModule { }
