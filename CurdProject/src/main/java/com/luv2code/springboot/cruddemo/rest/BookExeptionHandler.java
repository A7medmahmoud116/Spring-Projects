package com.luv2code.springboot.cruddemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookExeptionHandler {
    @ExceptionHandler
    public ResponseEntity<BookErrorMassage> handleExeption(BookNotFoundExeption exc){
        BookErrorMassage bookErrorMassage = new BookErrorMassage();
        bookErrorMassage.setStatus(HttpStatus.NOT_FOUND.value());
        bookErrorMassage.setMassage(exc.getMessage());
        bookErrorMassage.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(bookErrorMassage,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<BookErrorMassage> handleExeption(Exception exc){
        BookErrorMassage bookErrorMassage =new BookErrorMassage();
        bookErrorMassage.setStatus(HttpStatus.BAD_REQUEST.value());
        bookErrorMassage.setMassage("Bad Request");
        bookErrorMassage.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(bookErrorMassage,HttpStatus.BAD_REQUEST);
    }
}
