package com.nt.oopjavaservice;

import com.nt.oopjavaservice.domain.vo.ConsumeMsu;
import com.nt.oopjavaservice.util.File;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class OopJavaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopJavaServiceApplication.class, args);

		File file = new com.nt.oopjavaservice.util.File("SCRT_SEPT_2019.csv","C:\\Users\\mb76439\\IdeaProjects\\oop-java-project\\src\\main\\resources\\",LocalDateTime.now());
		file.read();

		//Esta es la creacion de un objeto y lo sabemos por la palabra reservada new
		// El estado de un objeto va a estar definido por sus atributos
		//ConsumeMsu consumeMsu = new ConsumeMsu("mex1",1);
		//System.out.println("LPAR:" + consumeMsu.getLpar());

		//ConsumeMsu test = new ConsumeMsu();
		//test.setLpar("dato");
		//System.out.println("LPAR:" + test.getLpar());



		//ConsumeMsu completo = new ConsumeMsu("mex1",1,LocalDateTime.now(),LocalDateTime.now());
	}

}
