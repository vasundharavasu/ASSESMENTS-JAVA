package com.org.demo;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee {

	
	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside Accountant constructor");
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
System.out.println("Accountant - ");
	}

	public void doWork() {
		// TODO Auto-generated method stub
		
	}

}
