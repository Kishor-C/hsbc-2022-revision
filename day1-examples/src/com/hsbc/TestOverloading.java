package com.hsbc;

public class TestOverloading {

	public static void main(String[] args) {
		
		test((byte)50); // test(int) -> test(long) -> test(float) -> test(double)
	}
	
	public static void test(byte b) { System.out.println("test(byte)"); }
	
	//public static void test(short s) { System.out.println("test(short)"); }
	
	//public static void test(int i) { System.out.println("test(int)"); }
	
	//public static void test(long l) { System.out.println("test(long)"); }
	
	//public static void test(float f) { System.out.println("test(float)"); }
	
	//public static void test(double d) { System.out.println("test(double)"); }
	

}
