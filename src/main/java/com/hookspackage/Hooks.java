package com.hookspackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before
	public void before() {
		System.out.println("Hi");
	}

	
	@After
	public void after() {
		System.out.println("Bye");
	}
}
