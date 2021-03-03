import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http'

@Injectable({
    providedIn: 'root'
})
export class FindDevicesService {

    constructor(private http: HttpClient) { }

    getDevices(): Observable<any> {
        return this.http.get('api/getdevices');
    }
}
