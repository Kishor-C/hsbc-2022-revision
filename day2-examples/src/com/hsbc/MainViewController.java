package com.hsbc;

import com.hsbc.beans.Test;
import com.hsbc.service.TestService;
import com.hsbc.util.ObjectFactory;

public class MainViewController {

	public static void main(String[] args) {
		// get the object through factory pattern & use
		// interface as reference
		TestService service = ObjectFactory.getTest(5);
		Test t = new Test(111, "Raj");
		service.m1(t);
		service.m2();
	}

}
