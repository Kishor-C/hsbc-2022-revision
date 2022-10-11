package com.hsbc;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		Scanner scan = new Scanner(System.in);
		for(int index = 0; index < employees.length; index++) {
			System.out.println("Enter id: ");
			int id = scan.nextInt();
			System.out.println("Enter name: ");
			String name = scan.next();
			System.out.println("Enter salary: ");
			double salary = scan.nextDouble();
			System.out.println("Enter dob in yyyy-MM-dd: ");
			LocalDate dob = LocalDate.parse(scan.next());
			System.out.println("Enter state:");
			String state = scan.next();
			System.out.println("Enter city:");
			String city = scan.next();
			System.out.println("Enter pin");
			String pin = scan.next();
			Address address = new Address(state, city, pin);
			Employee employee = new Employee(id, name, salary, dob, address);
			employees[index] = employee;
		}
		for(Employee emp : employees) {
			emp.display();
		}
		scan.close();
	}

}
