package com.genpact.jdbc;

public class Employee {
	private int id;
	private String nameString;
	private String addressString;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String nameString, String addressString) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.addressString = addressString;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	void showdata() {
		System.out.println(id+""+nameString+""+addressString);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		System.out.println(id+""+nameString+""+addressString);
		return super.toString();
	}
	

}
