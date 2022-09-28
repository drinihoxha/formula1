import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Driver } from './driver';
import { DriverService } from './driver.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  public drivers: Driver[] = [];
  public editDriver: Driver | undefined;
  public deleteDriver: Driver | undefined;

  constructor(private driverService: DriverService) { }

  ngOnInit(): void {
    this.getDrivers();
  }

  public getDrivers(): void {
    this.driverService.getDrivers().subscribe( 
      (response: Driver[]) => {
        this.drivers = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public onAddDriver(addForm: NgForm): void {
    document.getElementById('add-driver-form')?.click();
    this.driverService.addDriver(addForm.value).subscribe(
      (response: Driver) => {
        console.log(response);
        this.getDrivers();
        addForm.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
        addForm.reset(); 
      }
    );
  }


  public onUpdateDriver(driver: Driver): void {
    this.driverService.updateDriver(driver).subscribe(
      (response: Driver) => {
        console.log(response);
        this.getDrivers();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public onDeleteDriver(driverId: number): void {
    this.driverService.deleteDriver(driverId).subscribe(
      (response: void) => {
        console.log(response);
        this.getDrivers();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public searchDrivers(key: string): void {
    console.log(key);
    const results: Driver[] = [];

    for(const driver of this.drivers) {
      if(driver.fullName.toLocaleLowerCase().indexOf(key.toLocaleLowerCase()) !== -1
      || driver.team.toLocaleLowerCase().indexOf(key.toLocaleLowerCase()) !== -1) {
        results.push(driver);
      }
    }
    this.drivers = results;

    if(results.length === 0 || !key) {
      this.getDrivers();
    }
  }


  public onOpenModal(driver: Driver, mode: string): void {
    const container = document.getElementById('main-container');
    const button = document.createElement('button');

    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');

    if(mode === 'add') {
      button.setAttribute('data-target', '#addDriverModal');
    }
    if(mode === 'edit') {
      this.editDriver = driver;
      button.setAttribute('data-target', '#updateDriverModal'); /* UPDATE THIS WITH EDIT */
    }
    if(mode === 'delete') {
      this.deleteDriver = driver;
      button.setAttribute('data-target', '#deleteDriverModal'); /* UPDATE THIS WITH DELETE */
    }

    container?.appendChild(button);
    button.click();
  }
}
