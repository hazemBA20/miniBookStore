package com.bookstore.minibookstore.config;

import com.bookstore.minibookstore.models.User;
import com.bookstore.minibookstore.repositories.BookRepository;
import com.bookstore.minibookstore.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    public CommandLineRunner initData(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User(1L, "hazem",
                    "hazem@gmail.com","hazem1213" ));
            userRepository.save(new User(2L, "bahae",
                    "miboun@gmail.com","3asba" ));
            userRepository.save(new User(3L, "nehdi",
                    "miboun@gmail.com","3asba" ));
        };
    }


}
