package com.dev.springframework;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public void drive() {
		System.out.println("The bike is running!");
	}
}
