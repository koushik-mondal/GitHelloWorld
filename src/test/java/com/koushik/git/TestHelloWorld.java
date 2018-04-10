package com.koushik.git;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestHelloWorld {
	
	String input = "John";
	String message = "Hello John";
	HelloWorld helloWorld = new HelloWorld();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testSayHello() {
		assertEquals(message, helloWorld.sayHello(input)); //Comment added
	}
	
	@Test
	public void testSayHelloWithBlankName() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Input cannot be empty");
		helloWorld.sayHello("");
	}
	
	@Test
	public void testSayHelloWithNullName() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Input cannot be empty");
		helloWorld.sayHello(null);
	}
}
