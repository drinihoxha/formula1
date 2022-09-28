package com.example.formula1.service;

import com.example.formula1.exception.DriverNotFoundException;
import com.example.formula1.model.Driver;
import com.example.formula1.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DriverService {
  private final DriverRepository driverRepository;

  @Autowired
  public DriverService(DriverRepository driverRepository) {
    this.driverRepository = driverRepository;
  }


    public Driver addDriver(Driver driver) {
      return driverRepository.save(driver);
    }

  public List<Driver> findALlDrivers() {
    return driverRepository.findAll();
  }

  public Driver updateDriver(Driver driver) {
    return driverRepository.save(driver);
  }

  public Driver findDriverById(Long id) {
    return driverRepository.findDriverById(id).
            orElseThrow(() -> new DriverNotFoundException("Driver by id " + id + " was not found!"));
  }

  public void deleteDriver(Long id) {
    driverRepository.deleteDriverById(id);
  }
}














