package com.nt.oopjavaservice;

import com.nt.oopjavaservice.service.IScrtServicce;
import com.nt.oopjavaservice.service.ScrtService;
import com.nt.oopjavaservice.util.File;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	private IScrtServicce scrtServicce;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		 IScrtServicce scrtServicce = applicationContext.getBean(IScrtServicce.class);    // polimorfismo: cap q tiene un objeto de ser visto de dif formas
		scrtServicce.processFile();

	}

}
