package com.example.Homework;

import com.example.Homework.Week1.CakeBaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication implements CommandLineRunner {

	@Autowired
	CakeBaker cnf;

	public static void main(String[] args) {

		SpringApplication.run(HomeworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cnf.bakeCake();
	}
}
