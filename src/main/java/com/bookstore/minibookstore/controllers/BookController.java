package com.bookstore.minibookstore.controllers;

import com.bookstore.minibookstore.models.Book;
import com.bookstore.minibookstore.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/books")
public class BookController {
    private final BookService bookService;


    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;

    }

    @GetMapping
    public String getBooks(Model model) {
        System.out.println("/books get");
       return bookService.getBooks(model);

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
