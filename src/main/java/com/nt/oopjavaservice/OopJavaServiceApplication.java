package com.nt.oopjavaservice;

import com.nt.oopjavaservice.domain.vo.ConsumeMsu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopJavaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopJavaServiceApplication.class, args);

		ConsumeMsu consumeMsu = new ConsumeMsu("mex1", 1);
		System.out.println("LPAR: " + consumeMsu.getLpar());

		ConsumeMsu test = new ConsumeMsu();
		test.setLpar("dato");
		System.out.println("LPAR: " + test.getLpar());

	}
}