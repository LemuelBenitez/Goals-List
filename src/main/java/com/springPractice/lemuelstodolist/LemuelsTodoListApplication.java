package com.springPractice.lemuelstodolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LemuelsTodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(LemuelsTodoListApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurrer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("*")
						.allowedOrigins("http://localhost:3000", "http://localhost:8080").allowedHeaders("*");
			}
		};
	}
}
