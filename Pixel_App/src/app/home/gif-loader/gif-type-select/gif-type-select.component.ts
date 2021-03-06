import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-gif-type-select',
  templateUrl: './gif-type-select.component.html',
  styleUrls: ['./gif-type-select.component.scss'],
})
export class GifTypeSelectComponent implements OnInit {
  constructor(private router: Router) {}

  ngOnInit() {}

  routeTo(route: string) {
    this.router.navigate([route]);
  }
}
