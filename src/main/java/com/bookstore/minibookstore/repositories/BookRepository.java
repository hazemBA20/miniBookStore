package com.bookstore.minibookstore.repositories;

import com.bookstore.minibookstore.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepository {
    private final List<Book> books= new ArrayList<>();
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }


}
