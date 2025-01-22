package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Book;

import java.util.List;

public interface BookService {

    public Book addBook(Book mybook);
    public List<Book> getBooks();
    public Book findById(int theId);
    public String delete(int theId);
    public Book update(Book myBook);
}
