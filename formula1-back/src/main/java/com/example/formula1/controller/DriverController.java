package com.example.formula1.controller;

import com.example.formula1.model.Driver;
import com.example.formula1.service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {
  private final DriverService driverService;

  public DriverController(DriverService driverService) {
    this.driverService = driverService;
  }

  @GetMapping("/all")
  public ResponseEntity<List<Driver>> getAllDrivers() {
    List<Driver> drivers = driverService.findALlDrivers();

    return new ResponseEntity<>(drivers, HttpStatus.OK);
  }

  @GetMapping("/find/{id}")
  public ResponseEntity<Driver> getDriverById(@PathVariable("id") Long id) {
    Driver driver = driverService.findDriverById(id);

    return new ResponseEntity<>(driver, HttpStatus.OK);
  }

  @PostMapping("/add")
  public ResponseEntity<Driver> addDriver(@RequestBody Driver driver) {
    Driver newDriver = driverService.addDriver(driver);

    return new ResponseEntity<>(newDriver, HttpStatus.CREATED);
  }

  @PutMapping("/update")
  public ResponseEntity<Driver> updateDriver(@RequestBody Driver driver) {
    Driver updateDriver = driverService.updateDriver(driver);

    return new ResponseEntity<>(updateDriver, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> deleteDriver(@PathVariable("id") Long id) {
    driverService.deleteDriver(id);

    return new ResponseEntity<>(HttpStatus.OK);
  }

}














