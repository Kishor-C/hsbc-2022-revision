package com.hsbc;
class A { 
	A() {
		System.out.println("A() constructor");
	}
	A(int x) {
		System.out.println("A(int) constructor");
	}
} 
class B extends A { 
	B() {
		
		System.out.println("B() constructor");
	}
	B(int x) {
		
		System.out.println("B(int) constructor");
	}
} 
public class TestInheritance {

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("---------------");
		B b1 = new B();
		System.out.println("----------------");
		B b2 = new B(200);
	}

}
