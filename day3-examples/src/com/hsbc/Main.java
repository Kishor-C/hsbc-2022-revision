package com.hsbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee(2, "Raj", 35000);
		Employee e2 = new Employee(3, "Rajesh", 45000);
		Employee e3 = new Employee(1, "Vijay", 25000);
		Employee e4 = new Employee(4, "Sachin", 40000);
		Employee e5 = new Employee(4, "Sachin", 40000);
		
		List<Employee> set = new ArrayList<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		Comparator<Employee> comparator1 = new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
					return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(set, comparator1);
		for(Employee e : set) {
			System.out.println(e);
		}
		// Create another implementation comparator to compare salary & supply that comparator to the sort method
	}
}