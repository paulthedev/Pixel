import { Component, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { CanvasWhiteboardOptions } from 'ng2-canvas-whiteboard';

@Component({
  selector: 'app-matrix',
  templateUrl: './matrix.component.html',
  styleUrls: ['./matrix.component.scss'],
})
export class MatrixComponent implements OnInit {
  hueColor: string = '#000000';
  shadeColor: string = '#000000';

  canvasOptions: CanvasWhiteboardOptions = {
    lineWidth: 5,
    strokeColor: '#000000',
    shouldDownloadDrawing: true,
    aspectRatio: 1,
    drawingEnabled: true,
    fillColor: '#000000',
  };

  constructor(public modalController: ModalController) {}

  ngOnInit() {}

  async hueChangeComplete(event) {
    this.hueColor = event.color.hex;
    this.shadeColor = this.hueColor;
    this.canvasOptions = {...this.canvasOptions,
      strokeColor: this.hueColor};
  }

  async shadeChangeComplete(event) {
    this.shadeColor = event.color.hex;
    this.canvasOptions = {...this.canvasOptions,
      strokeColor: this.shadeColor};
  }

  onCanvasDraw(event) {}
  onCanvasClear() {}
  onCanvasUndo(event) {}
  onCanvasRedo(event) {}
}
