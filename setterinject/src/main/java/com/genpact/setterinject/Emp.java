package com.genpact.setterinject;

public class Emp {

	private int id;
	private String nameString;
	private String addressString;
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

}
