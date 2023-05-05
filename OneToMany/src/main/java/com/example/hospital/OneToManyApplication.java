package com.example.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
		 title = "One To Many",
		 version = "1.1.2",
		 description = "One To Many Project",
		 contact = @Contact(
		 name = "Gayathri",
		 email = "gayathri12@gmail.com"
		 )
		 )
		 )
public class OneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

}
