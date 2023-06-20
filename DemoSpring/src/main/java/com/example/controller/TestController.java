package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/hello")
	public String Hello() {
		System.out.println("Test");
		System.out.println("Test2");
		return "Good Morning";
	}

}
