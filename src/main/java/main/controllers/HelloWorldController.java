package main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/") // ---> root controller
public class HelloWorldController {
	@GetMapping("/")
	public String helloWorld() {
		return "helloWorld";
	
	}
	
	@GetMapping("/chan")
	public String helloWorld2() {
		return "helloWorld2";
	
	}

}
