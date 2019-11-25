package com.nt.oopjavaservice;

import com.nt.oopjavaservice.service.IScrtService;
import com.nt.oopjavaservice.service.ScrtService;
import com.nt.oopjavaservice.util.File;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		IScrtService scrtService = applicationContext.getBean(IScrtService.class);
		scrtService.processFile();

	}

}
