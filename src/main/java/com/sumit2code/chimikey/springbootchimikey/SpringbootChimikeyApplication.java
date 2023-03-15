package com.sumit2code.chimikey.springbootchimikey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sumit2code.chimikey")
public class SpringbootChimikeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootChimikeyApplication.class, args);
	}

}
