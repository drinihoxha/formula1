import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SortByPointsPipe } from './sort-by-points.pipe';


@NgModule({
  declarations: [
    AppComponent,
    SortByPointsPipe
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  // providers: [DriverService],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
