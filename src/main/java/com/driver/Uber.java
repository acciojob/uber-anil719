package com.driver;

import io.swagger.v3.oas.annotations.info.Contact;

import io.swagger.v3.oas.annotations.info.Info;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication

@OpenAPIDefinition(
	info = @Info(
			title = "Uber API Application",
			version = "1.0.0",
			description = "This is my Learning Project",
			termsOfService = "runcodenow",
			contact = @Contact(
					name = "Mr Anil Terapalli",
					email = "anilterapalli@gmail.com"
			),
			license = @License(
					name = "licence",
					url = "runcodenow"
			)
	)
)
public class Uber {

	public static void main(String[] args) {
		SpringApplication.run(Uber.class, args);
	}

}
