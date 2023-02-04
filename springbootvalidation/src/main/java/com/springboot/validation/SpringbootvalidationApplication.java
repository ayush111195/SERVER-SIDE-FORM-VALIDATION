package com.springboot.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@SpringBootApplication
public class SpringbootvalidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootvalidationApplication.class, args);
	}

}

