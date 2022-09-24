package com.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcuTest {

private Calculator calc;
	
	@BeforeEach
	public void setup() {
		calc= new Calculator();
		System.out.println("Calculator Initiated");
	}
	
	@AfterEach
	public void tearDown() {
		calc=null;
		System.out.println("Calculator Closed");
	}
	@Test
	public void addtest() {
		assertEquals(7, calc.add(4, 3));
	}
	@Test
	public void subtest() {
		assertEquals(9, calc.sub(12, 3));
		assertNotEquals(7, calc.sub(12, 3));
	}
	
	@Test
	public void mul() {
		assertEquals(12, calc.mul(4, 3));
		assertNotEquals(30, calc.mul(12, 3));
	}
	
	@Test
	public void div() {
		assertEquals(10, calc.div(100, 10));
		assertNotEquals(30, calc.div(12, 3));
	}

}
