package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;

@SpringBootApplication //(exclude = {AopAutoConfiguration.class})
public class SydeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SydeoApplication.class, args);
	}

}
