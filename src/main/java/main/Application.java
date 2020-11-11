package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {	
	
	public static void main(String[] args) {
		
		//When you run this main method as a java program, your web server will come up on your local system
		SpringApplication.run(Application.class, args);
		

	}

}
