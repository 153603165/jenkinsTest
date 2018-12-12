package com.kfwl.jenkins_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
	@SuppressWarnings("unused")
	@RequestMapping("/hello")
	public String hello() {
		
		return "Hello World";
	}
}