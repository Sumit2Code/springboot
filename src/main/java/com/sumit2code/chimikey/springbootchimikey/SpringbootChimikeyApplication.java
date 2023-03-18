package com.sumit2code.chimikey.springbootchimikey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sumit2code.chimikey")
public class SpringbootChimikeyApplication extends SpringBootServletInitializer {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(SpringbootChimikeyApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootChimikeyApplication.class, args);
	}

}
