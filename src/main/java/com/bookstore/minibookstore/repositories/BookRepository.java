package com.bookstore.minibookstore.repositories;

import com.bookstore.minibookstore.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookRepository {
    private final List<Book> Books;

    @Autowired
    public BookRepository(List<Book> Books) {
        this.Books = Books;
    }
}
