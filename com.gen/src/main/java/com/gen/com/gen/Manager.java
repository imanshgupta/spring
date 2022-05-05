package com.gen.com.gen;


import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{

	public Accountant accountant;
	public Security security;
	public Cashier cashier;
	

	public Manager(Accountant accountant, Security security, Cashier cashier) {
		super();
		System.out.println("this is Manager Constructor");
		this.accountant = accountant;
		this.security = security;
		this.cashier = cashier;
	}

	

	public void calMeeting() {
		accountant.doWork();
		security.doWork();
		cashier.doWork();
	}
	
	
	
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("MANAGER manages the branch office and project");
	}

}
