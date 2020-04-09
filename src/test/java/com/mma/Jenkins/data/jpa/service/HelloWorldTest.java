package com.mma.Jenkins.data.jpa.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mma.Jenkins.data.jpa.domain.HelloWorld;

public class HelloWorldTest {

	private HelloWorld helloWorld;
	
	@Before
	public void setup() {
		helloWorld = new HelloWorld();
	}
	
	@Test
	public void sayHelloWorldTest() {
		assertEquals(helloWorld.sayHelloWorld(), "Hello World !");
	}
}
