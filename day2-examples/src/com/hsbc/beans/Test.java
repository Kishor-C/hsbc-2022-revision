package com.hsbc.beans;

public class Test {
	// you can create private variables
	// constructors
	// setters & getters
	private int id;
	private String name;
	public Test(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
