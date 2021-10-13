package com.example.sqlitedemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


import java.util.Arrays;

@SpringBootApplication
public class SqlitedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlitedemoApplication.class, args);
	}



}
