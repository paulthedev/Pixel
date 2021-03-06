import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { giphy_api_key } from 'src/app/app.constants';

@Injectable({
  providedIn: 'root',
})
export class GiphyService {
  private baseApiUrl = 'https://api.giphy.com/v1/gifs/';

  constructor(private http: HttpClient) {

  }

  fetchTrending(offset: number, limit: number = 10) {
    let params = new HttpParams();
    params = params.append('api_key', giphy_api_key.toString());
    params = params.append('limit', limit.toString());
    params = params.append('offset', offset.toString());

    return this.http.get(this.baseApiUrl+'trending', {params : params});
  }
}
