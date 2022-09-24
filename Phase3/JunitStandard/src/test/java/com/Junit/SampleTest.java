package com.Junit;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {

	@BeforeAll
	public static void BeforeAll() {
		System.out.println("Before All");
	}
	@BeforeEach
	public void BeforeEach() {
		System.out.println("Before Each");
	}
	@Test
	void testOne() {
		System.out.println("Test one");
	}
	@Test
	public void testtwo() {
		System.out.println("JUNIT Test-2");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("After Each");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}

}
