package com.example.formula1.repository;

import com.example.formula1.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {
  void deleteDriverById(Long id);
  Optional<Driver> findDriverById(Long id);
}
