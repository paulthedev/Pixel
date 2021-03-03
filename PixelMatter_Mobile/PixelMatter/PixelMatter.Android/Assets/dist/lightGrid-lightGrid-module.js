(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["lightGrid-lightGrid-module"],{

/***/ "Aohf":
/*!***********************************************!*\
  !*** ./src/app/lightGrid/lightGrid.module.ts ***!
  \***********************************************/
/*! exports provided: LightGridModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LightGridModule", function() { return LightGridModule; });
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/common */ "ofXK");
/* harmony import */ var _lightGrid_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./lightGrid.component */ "XvZG");
/* harmony import */ var _lightGrid_routing_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./lightGrid-routing.module */ "vXMi");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");




class LightGridModule {
}
LightGridModule.ɵmod = _angular_core__WEBPACK_IMPORTED_MODULE_3__["ɵɵdefineNgModule"]({ type: LightGridModule });
LightGridModule.ɵinj = _angular_core__WEBPACK_IMPORTED_MODULE_3__["ɵɵdefineInjector"]({ factory: function LightGridModule_Factory(t) { return new (t || LightGridModule)(); }, imports: [[
            _angular_common__WEBPACK_IMPORTED_MODULE_0__["CommonModule"],
            _lightGrid_routing_module__WEBPACK_IMPORTED_MODULE_2__["LightGridRoutingModule"]
        ]] });
(function () { (typeof ngJitMode === "undefined" || ngJitMode) && _angular_core__WEBPACK_IMPORTED_MODULE_3__["ɵɵsetNgModuleScope"](LightGridModule, { declarations: [_lightGrid_component__WEBPACK_IMPORTED_MODULE_1__["LightGridComponent"]], imports: [_angular_common__WEBPACK_IMPORTED_MODULE_0__["CommonModule"],
        _lightGrid_routing_module__WEBPACK_IMPORTED_MODULE_2__["LightGridRoutingModule"]] }); })();


/***/ }),

/***/ "XvZG":
/*!**************************************************!*\
  !*** ./src/app/lightGrid/lightGrid.component.ts ***!
  \**************************************************/
/*! exports provided: LightGridComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LightGridComponent", function() { return LightGridComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "tyNb");


class LightGridComponent {
    constructor() { }
    ngOnInit() {
    }
}
LightGridComponent.ɵfac = function LightGridComponent_Factory(t) { return new (t || LightGridComponent)(); };
LightGridComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: LightGridComponent, selectors: [["app-lightGrid"]], decls: 1, vars: 0, template: function LightGridComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](0, "router-outlet");
    } }, directives: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterOutlet"]], styles: ["\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJsaWdodEdyaWQuY29tcG9uZW50LnNjc3MifQ== */"] });


/***/ }),

/***/ "sr0A":
/*!******************************************************!*\
  !*** ./src/app/lightGrid/matrix/matrix.component.ts ***!
  \******************************************************/
/*! exports provided: MatrixComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MatrixComponent", function() { return MatrixComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "fXoL");

class MatrixComponent {
    constructor() { }
    ngOnInit() {
    }
}
MatrixComponent.ɵfac = function MatrixComponent_Factory(t) { return new (t || MatrixComponent)(); };
MatrixComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: MatrixComponent, selectors: [["app-matrix"]], decls: 2, vars: 0, template: function MatrixComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](1, " matrix Works! ");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    } }, encapsulation: 2 });


/***/ }),

/***/ "vXMi":
/*!*******************************************************!*\
  !*** ./src/app/lightGrid/lightGrid-routing.module.ts ***!
  \*******************************************************/
/*! exports provided: LightGridRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LightGridRoutingModule", function() { return LightGridRoutingModule; });
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/router */ "tyNb");
/* harmony import */ var _matrix_matrix_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./matrix/matrix.component */ "sr0A");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/core */ "fXoL");




const routes = [
    {
        path: '',
        component: _matrix_matrix_component__WEBPACK_IMPORTED_MODULE_1__["MatrixComponent"]
    }, {
        path: 'matrix',
        component: _matrix_matrix_component__WEBPACK_IMPORTED_MODULE_1__["MatrixComponent"]
    }
];
class LightGridRoutingModule {
}
LightGridRoutingModule.ɵmod = _angular_core__WEBPACK_IMPORTED_MODULE_2__["ɵɵdefineNgModule"]({ type: LightGridRoutingModule });
LightGridRoutingModule.ɵinj = _angular_core__WEBPACK_IMPORTED_MODULE_2__["ɵɵdefineInjector"]({ factory: function LightGridRoutingModule_Factory(t) { return new (t || LightGridRoutingModule)(); }, imports: [[_angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"].forChild(routes)], _angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"]] });
(function () { (typeof ngJitMode === "undefined" || ngJitMode) && _angular_core__WEBPACK_IMPORTED_MODULE_2__["ɵɵsetNgModuleScope"](LightGridRoutingModule, { imports: [_angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"]], exports: [_angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"]] }); })();


/***/ })

}]);
//# sourceMappingURL=lightGrid-lightGrid-module.js.map