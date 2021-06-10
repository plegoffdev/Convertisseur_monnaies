package com.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConvertisseurMonnaiesApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ConvertisseurMonnaiesApplication.class, args);
		
		ApplicationContext ctxApplicationContext = SpringApplication.run(ConvertisseurMonnaiesApplication.class, args);
		TestAppli bean = ctxApplicationContext.getBean(TestAppli.class);
		bean.launchtest();
	}

}
