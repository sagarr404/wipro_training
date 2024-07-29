package com.pack1;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	static Calculator calculator =null;
	
	@BeforeClass
	public  static void init() {
		System.out.println(new Date());
		calculator = new Calculator();
		System.out.println("Testing will be started");
	}
    @AfterClass
	public static  void stop() {
		calculator = null;
		System.out.println(new Date());
		System.out.println("All testing completed");
	}
   @Before			
	public void start() {
		System.out.println("Start test");
	}
   @After
    public void end() {
    	System.out.println("End test");
    }
	@Test
	@Ignore
	public void additionTest() {
		int result = calculator.addition(1, 20);
		assertEquals(21, result );
	}
	@Test
	public void multiplyTest() {
		int result = calculator.multiply(1, 20);
		assertEquals(20, result );
	}
	@Test
	public void subtractionTest() {
		int result = calculator.subtraction(1, 20);
		assertEquals(-19, result );
	}
	
	@Test
	public void divisionTest() {
		int result = calculator.division(12, 2);
		assertEquals(6, result );
	}
	
	@Test(expected = ArithmeticException.class)
	public void divisionTestForException() {
		int result = calculator.division(12, 0);
		
	}
}
