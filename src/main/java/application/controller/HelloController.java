package application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Hello;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/sayHello")
	public Hello sayHello() {
		Hello hello = new Hello();
		hello.setName("hello world");
		hello.setAge(20);
		return hello;
	}
	
}
