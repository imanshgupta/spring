package com.org.practive;

public class abc {

	public String nameString;
	public int age;
	
	
	public abc() {
		super();
	}
	
	
	public abc(String nameString, int age) {
		super();
		this.nameString = nameString;
		this.age = age;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		System.out.println(this.age);
		System.out.println(this.nameString);
		
		return super.toString();
	}
	
	public void printAbc() {
		System.out.println("ABC");
	}
	
	
	
	
}
