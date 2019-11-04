package com.nt.oopjavaservice;

import com.nt.oopjavaservice.domain.vo.ConsumeMsu;
import com.nt.oopjavaservice.util.File;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class OopJavaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopJavaServiceApplication.class, args);

		File file = new File("SCRT_SEPT_2019.csv", "/Users/cjeronimo/Code/java/Learning/oop-java-project/src/main/resources/", LocalDate.now());
		file.read();

	}
}