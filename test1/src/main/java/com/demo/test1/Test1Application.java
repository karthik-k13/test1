package com.demo.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {

		String branch="main";

		int x=10;
		//String branch="dev";

		SpringApplication.run(Test1Application.class, args);
	}

}
