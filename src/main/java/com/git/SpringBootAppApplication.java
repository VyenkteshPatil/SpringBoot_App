package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootAppApplication.class, args);
	
		//changes for HIS-134
		run.close();
	}

	//HIS-200 related changes

	public void doProcess(){
		//logic goes here
	}

}
