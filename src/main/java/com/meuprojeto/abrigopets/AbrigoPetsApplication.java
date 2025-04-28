package com.meuprojeto.abrigopets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.SQLOutput;

@SpringBootApplication
public class AbrigoPetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbrigoPetsApplication.class, args);
	}
}
