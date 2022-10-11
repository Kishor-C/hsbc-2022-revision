package com.hsbc.service;

import com.hsbc.beans.Test;

public class TestServiceImplOne implements TestService {
   // you can create variables you want
	@Override
	public void m1(Test t) {
		// implement the methods as per requirement
		System.out.println("m1() of One");
	}

	@Override
	public void m2() {
		// implement the methods as per requirement
		System.out.println("m2() of One");
	}

}
