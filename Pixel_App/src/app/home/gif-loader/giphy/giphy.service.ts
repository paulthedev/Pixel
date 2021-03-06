import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class GiphyService {
  private baseApiUrl = 'api.giphy.com/v1/gifs/';

  constructor(private http: HttpClient) {

  }

  fetchTrending(offset: number, limit: number = 10) {
    let params = new HttpParams();
    params = params.append('limit', limit.toString());
    params = params.append('offset', offset.toString());

    this.http.get(this.baseApiUrl+'trending', {params : params});
  }
}
