package com.cruds.calculator.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	Calculator c;
	
	@Test
	public void testSum() {
		c = new Calculator();
		c.add(new Calculator(20, 20));
		assertTrue(true);

		
	}
	
	@Test
	public void testSub(){
		c =  new Calculator(); 
		c.sub(new Calculator(50, 10));
		assertTrue(true);
	}

}
