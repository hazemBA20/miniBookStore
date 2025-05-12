package com.bookstore.minibookstore.config;

import com.bookstore.minibookstore.models.User;
import com.bookstore.minibookstore.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    public CommandLineRunner startupConfig(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User(1L, "hazem",
                    "hazem@gmail.com","hazem1213" ));

        };
    }


}
