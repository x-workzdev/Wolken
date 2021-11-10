package com.wolken.monument.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.monument.service.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	HelloService service;
	
	@RequestMapping("/hello")
	String pringHello() {
		
		System.out.println("hello is working fine");
		service.printHello();
		return "hello.jsp";
	}
	

}
