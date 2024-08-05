package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

private static String REST_URL="https://www.equifax.com/getScore";

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootAppApplication.class, args);
	
		//changes for HIS-134
		run.close();

		int a = 10;

		int b = 20;
	}

}
