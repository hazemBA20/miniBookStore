package com.bookstore.minibookstore.config;

import com.bookstore.minibookstore.models.Book;
import com.bookstore.minibookstore.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {
    @Bean
    public CommandLineRunner initData(BookRepository bookRepository) {
        return args -> {
            bookRepository.save(new Book(4 , "learn web dev" , "hazem" , 200 ));

        };
    }

}
