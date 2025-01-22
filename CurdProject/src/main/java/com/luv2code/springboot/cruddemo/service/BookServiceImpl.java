package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.BookDAO;
import com.luv2code.springboot.cruddemo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    BookDAO bookDAO;

    @Autowired
    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Transactional
    @Override
    public Book addBook(Book mybook) {
        return bookDAO.addBook(mybook);
    }

    @Override
    public List<Book> getBooks() {
        return bookDAO.getBooks();
    }

    @Override
    public Book findById(int theId) {
        return bookDAO.findById(theId);
    }

    @Transactional
    @Override
    public String delete(int theId) {
        return bookDAO.delete(theId);
    }

    @Transactional
    @Override
    public Book update(Book myBook) {
        return bookDAO.update(myBook);
    }
}
