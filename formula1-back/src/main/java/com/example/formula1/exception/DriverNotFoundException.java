package com.example.formula1.exception;

public class DriverNotFoundException extends RuntimeException {
  public DriverNotFoundException(String message) {
    super(message);
  }
}
