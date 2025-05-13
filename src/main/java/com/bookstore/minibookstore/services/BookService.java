package com.bookstore.minibookstore.services;

import com.bookstore.minibookstore.models.Book;
import com.bookstore.minibookstore.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBooks(Model model) {
        List<Book> target = bookRepository.getBooks();
       model.addAttribute("books", target);
        return "books";


    }

    public Book getBook(int id) {
        List<Book> target=bookRepository.getBooks();
        return target.get(id - 1);
    }

    public void addBook(Book book) {
         bookRepository.save(book);
    }
}
