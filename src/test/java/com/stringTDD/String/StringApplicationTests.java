package com.stringTDD.String;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StringApplicationTests {

	@Test
	public void testEmptyString()
	{
		assertEquals(0,Calculator.add(""));
	}

	@Test
	public void testOneNumber()
	{
		assertEquals(1,Calculator.add("1"));
	}

}

