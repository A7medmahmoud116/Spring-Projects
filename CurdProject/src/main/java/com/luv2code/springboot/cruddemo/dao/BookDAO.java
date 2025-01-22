package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookDAO {
    public Book addBook(Book mybook);
    public List<Book> getBooks();
    public Book findById(int theId);
    public String delete(int theId);
    public Book update(Book myBook);
}
