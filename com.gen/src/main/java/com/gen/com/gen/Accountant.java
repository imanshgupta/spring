package com.gen.com.gen;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee{

	
	
	
	public Accountant() {
		super();
	
		System.out.println("Accountant constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("accountant");
		
	}

}
