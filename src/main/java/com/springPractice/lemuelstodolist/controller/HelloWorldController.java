package com.springPractice.lemuelstodolist.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lemuelstodolist.service.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/helloWorld")
	@CrossOrigin(origins = "http://localhost:3000/helloWorld", allowCredentials = "true")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/helloWorld_Bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Musashi");
	}

	@GetMapping(path = "/helloWorld_Bean/{name}")
	public HelloWorldBean HelloWorldBean(@PathVariable String name) {
		// TODO Auto-generated method stub
		return new HelloWorldBean(String.format("Hello , %s", name));
	}
}
