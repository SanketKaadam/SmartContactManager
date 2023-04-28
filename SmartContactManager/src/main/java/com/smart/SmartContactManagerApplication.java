package com.smart;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.smart.controller"}) // this scanBasePackage is save my time, before this it take my 2 days to debug
//@ComponentScan(basePackages = {"com.smart.controller", "com.smart.dao.UserRepository"})
public class SmartContactManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartContactManagerApplication.class, args);
	}

} 
