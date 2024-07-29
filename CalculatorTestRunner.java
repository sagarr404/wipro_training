package com.pack1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CalculatorTestRunner {

	public static void main(String[] args) {
		Result results = JUnitCore.runClasses(CalculatorTest.class);
		
		for(Failure failure : results.getFailures()) {
			System.out.println(failure.getMessage());
		}
		
		System.out.println("Testing Success: " + results.wasSuccessful());

	}

}
