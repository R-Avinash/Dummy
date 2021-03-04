package com.capg.myapp.testing;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.capg.myapp.example.Calculator;


class CalculatorTest {
	static Calculator calci= null;
	@BeforeAll	// if this anotion is given it will start to execute from here
	public static void beforeAll() {
		System.out.println("Before all executed");
		calci= new Calculator();

	}
	@BeforeEach
	public void before() {
		System.out.println("Before once every test..");
	}
	@AfterEach
	public void after() {
		System.out.println("After each test...");
	}
	
	@Test // Mandotory anotation dont del
	void testAdd() {
		System.out.println("Add tested");
		assertEquals(8,calci.add(4, 4));
		
	}

	@Test
	@Disabled
	void testSub() {
		System.out.println("Sub tested");
		assertSame(0,calci.sub(4, 4));
		assertNotNull(calci);
	}

	@Test
	void testDiv() {
		System.out.println("Div tested");
		int actual= calci.div(10, 10);
		int expected=5;
		assertTrue(actual<expected);
	}
	@AfterAll 
	public static void AfterAll() {
		System.out.println("After All");
	}

}
