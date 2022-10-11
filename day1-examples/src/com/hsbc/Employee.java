package com.hsbc;

import java.time.LocalDate;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private LocalDate dob;
	private Address address;
	public Employee(int id, String name, double salary, LocalDate dob, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.println("Id = "+id+", Name = "+name+", Salary = "+salary+", Dob = "+dob+
	", State = "+address.getState()+", City = "+address.getCity()+", Pin = "+address.getPin());
	}
	
}
