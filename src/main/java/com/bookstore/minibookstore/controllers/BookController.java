package com.bookstore.minibookstore.controllers;

import com.bookstore.minibookstore.models.Book;
import com.bookstore.minibookstore.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/books")
public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
    @GetMapping(path = "{bookId}")
    public Book getBook(@PathVariable("bookId") int bookId) {
        return bookService.getBook(bookId);

    }
    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);

    }
}
