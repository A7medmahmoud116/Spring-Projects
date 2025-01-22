package com.luv2code.springboot.cruddemo.rest;

public class BookNotFoundExeption extends RuntimeException{
    public BookNotFoundExeption(String message) {
        super(message);
    }
}
