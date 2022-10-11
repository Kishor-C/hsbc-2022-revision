package com.hsbc.util;

import com.hsbc.service.TestService;
import com.hsbc.service.TestServiceImplOne;

public class ObjectFactory {
	public static TestService getTest(int option) {
		// you can return different TestService implementation
		// based on the option
		return new TestServiceImplOne();
	}
}
