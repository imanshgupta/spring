package com.gen.com.gen;

import org.springframework.stereotype.Component;

@Component
public class Security implements Employee {
	
	public Security() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("KEeps the office clean");
	}

}
