package com.nt.oopjavaservice;

import com.nt.oopjavaservice.service.IScrtService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		IScrtService scrtService =  applicationContext.getBean(IScrtService.class);
        scrtService.processFile();

	}
}