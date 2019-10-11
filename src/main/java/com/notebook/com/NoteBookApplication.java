package com.notebook.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class NoteBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteBookApplication.class, args);
	}

}
