package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {


private Map<String,Object> cache = new HashMap<String,Object>();

private static String REST_URL="https://www.equifax.com/getScore";


	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootAppApplication.class, args);
	
		//changes for HIS-134
		run.close();

		int a = 10;


	}


	//HIS-301 changes
	public void loadDataToCache(){
		//logic
	}

	

}





//123
