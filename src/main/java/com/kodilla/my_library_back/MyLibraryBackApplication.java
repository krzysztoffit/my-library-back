package com.kodilla.my_library_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MyLibraryBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyLibraryBackApplication.class, args);
	}

}
