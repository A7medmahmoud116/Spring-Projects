package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO{

    EntityManager entityManager;

    @Autowired
    public BookDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public Book addBook(Book mybook) {
        Book theDbBook = entityManager.merge(mybook);
        return theDbBook;
    }

    @Override
    public List<Book> getBooks() {
        TypedQuery<Book> query = entityManager.createQuery("FROM Book",Book.class);
        List<Book> books = query.getResultList();
        return books;
    }
}
