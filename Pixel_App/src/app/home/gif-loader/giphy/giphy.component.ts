import { Component, OnInit } from '@angular/core';
import {
  GiphyImageDataArray,
  GiphyImageData,
  GiphyImage,
} from './dto/image-data.model';
import { GiphyService } from './giphy.service';

@Component({
  selector: 'app-giphy',
  templateUrl: './giphy.component.html',
  styleUrls: ['./giphy.component.scss'],
  providers: [],
})
export class GiphyComponent implements OnInit {
  offset: number = 0;

  gifArray: Array<GiphyImageData> = [];
  constructor(private giphyService: GiphyService) {}

  ngOnInit() {
    this.loadData(null);
  }

  loadData(event) {
    this.giphyService.fetchTrending(this.offset, 10).subscribe(
      (response: GiphyImageDataArray) => {
        response.data.forEach((d: GiphyImageData) => {
          this.gifArray.push(d);
        });
        this.offset += 10;
      },
      () => {},
      () => {
        if (event) event.target.complete();
      }
    );
  }
}
