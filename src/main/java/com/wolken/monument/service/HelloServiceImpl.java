package com.wolken.monument.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	public void printHello() {
		System.out.println("hello");
	}

}
