import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-giphy',
  templateUrl: './giphy.component.html',
  styleUrls: ['./giphy.component.scss'],
  providers: [],
})
export class GiphyComponent implements OnInit {
  offset: number = 0;
  constructor() {}

  ngOnInit() {}

  loadData(event) {
    event.target.complete();
  }
}
