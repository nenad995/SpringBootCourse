package com.nenad.springrestdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException ex) {
        StudentErrorResponse body = new StudentErrorResponse();
        body.setStatus(HttpStatus.NOT_FOUND.value());
        body.setMessage(ex.getMessage());
        body.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception ex) {
        StudentErrorResponse body = new StudentErrorResponse();
        body.setStatus(HttpStatus.BAD_REQUEST.value());
        //body.setMessage(ex.getMessage());
        body.setMessage("ID of the student must be numeric value");
        body.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }
}
