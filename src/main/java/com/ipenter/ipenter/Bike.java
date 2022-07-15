package com.ipenter.ipenter;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public void drive() {
		System.out.println("Bike is Riding...");
		
	}
	
}
