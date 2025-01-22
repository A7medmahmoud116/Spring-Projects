package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.Book;
import com.luv2code.springboot.cruddemo.service.BookService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookCurdRestController {
    BookService bookService;

    @Autowired
    public BookCurdRestController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping("/books")
    public Book addBook(@RequestBody Book myBook){
        return bookService.addBook(myBook);
    }
    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
    @GetMapping("/books/{theId}")
    public Book findById(@PathVariable int theId){
        return bookService.findById(theId);
    }
    @DeleteMapping("/books/{theId}")
    public String delete(@PathVariable int theId){
        return bookService.delete(theId);
    }
    @PutMapping("/books")
    public Book update(@RequestBody Book book){
        return bookService.update(book);
    }
}
