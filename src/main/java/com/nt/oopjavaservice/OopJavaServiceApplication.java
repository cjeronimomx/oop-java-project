package com.nt.oopjavaservice;

import com.nt.oopjavaservice.domain.vo.ConsumeMsu;
import com.nt.oopjavaservice.util.File;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class OopJavaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopJavaServiceApplication.class, args);

        File unfile = new File("SCRT_SEPT_2019.csv", "C:\\Users\\M842524\\IdeaProjects\\oop-java-project\\src\\main\\resources\\", LocalDate.now());
        unfile.read();
	//	ConsumeMsu consumeMsu = new ConsumeMsu("mex1",1);
	//	System.out.println("LPAR: " + consumeMsu.getLpar());

	//	ConsumeMsu test = new ConsumeMsu();
	//	test.setLpar("dato");
	//	System.out.println("LPAR: " + test.getLpar());
	}

}
