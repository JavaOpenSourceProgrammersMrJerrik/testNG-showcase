package com.fsnc.testng.method;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MethodTest {

	@Parameters("firstName")
	@Test
	public void testSingleString(@Optional String firstName) {
		System.out.println("Invoked testString " + firstName);
		assert "Cedric".equals(firstName);
	}
}
