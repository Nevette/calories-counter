import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { IngredientsComponent } from './ingredients.component';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    IngredientsComponent
  ],
  exports: [
      IngredientsComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [IngredientsComponent]
})
export class IngredientsModule { }
