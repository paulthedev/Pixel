import { Component, OnInit } from '@angular/core';
import { FindDevicesService } from './FindDevices.service'

@Component({
    selector: 'app-FindDevices',
    templateUrl: './FindDevices.component.html',
    styleUrls: ['./FindDevices.component.scss']
})
export class FindDevicesComponent implements OnInit {
    devices: any = null;

    constructor(private _findDevice: FindDevicesService) { }

    ngOnInit() {
        this._findDevice.getDevices().subscribe(
            (response: any) => { this.devices = JSON.stringify(response) },
            (err: any) => { this.devices = JSON.stringify(err) });
    }

}
