
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Driver } from './driver';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class DriverService {

  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getDrivers(): Observable<Driver[]> {
    return this.http.get<Driver[]>(`${this.apiServerUrl}/driver/all`);
  }

  public addDriver(driver: Driver): Observable<Driver> {
    return this.http.post<Driver>(`${this.apiServerUrl}/driver/add`, driver);
  }

  public updateDriver(driver: Driver): Observable<Driver> {
    return this.http.put<Driver>(`${this.apiServerUrl}/driver/update`, driver);
  }

  public deleteDriver(driverId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/driver/delete/${driverId}`);
  }

}
