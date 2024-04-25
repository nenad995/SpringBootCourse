package com.nenad.cruddemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeAdvice {

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorMessage> handleException(Exception exception){
        EmployeeErrorMessage employeeErrorMessage = new EmployeeErrorMessage();
        employeeErrorMessage.setStatus(HttpStatus.BAD_REQUEST.value());
        employeeErrorMessage.setMessage(exception.getMessage());
        employeeErrorMessage.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(employeeErrorMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorMessage> handleException(EmployeeNotFoundException exception){
        EmployeeErrorMessage employeeErrorMessage = new EmployeeErrorMessage();
        employeeErrorMessage.setStatus(HttpStatus.NOT_FOUND.value());
        employeeErrorMessage.setMessage(exception.getMessage());
        employeeErrorMessage.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(employeeErrorMessage, HttpStatus.NOT_FOUND);
    }

}
