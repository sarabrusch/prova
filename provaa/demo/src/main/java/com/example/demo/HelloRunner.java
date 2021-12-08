package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

public class HelloRunner implements CommandLineRunner {
	
	public void run(String[] args) {
		System.out.println("Hello World!");
	}
}
