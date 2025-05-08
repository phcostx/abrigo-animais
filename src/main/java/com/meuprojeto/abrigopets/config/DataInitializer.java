package com.meuprojeto.abrigopets.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.meuprojeto.abrigopets.model.User;
import com.meuprojeto.abrigopets.service.UserService;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) {
        // Criar usuário admin
        if (userService.findByUsername("admin").isEmpty()) {
            userService.createUser("admin", "admin123", User.UserRole.ADMIN);
        }

        // Criar usuário padrão
        if (userService.findByUsername("user").isEmpty()) {
            userService.createUser("user", "user123", User.UserRole.USER);
        }
    }
} 