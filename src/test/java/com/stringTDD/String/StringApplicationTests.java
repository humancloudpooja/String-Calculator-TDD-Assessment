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

	@Test
	public void testTwoNumber()
	{
		assertEquals(4,Calculator.add("1,3"));
	}

	@Test
	public void testStringWithNegativeNumber()
	{
		try
		{
			Calculator.add("-1,-2");
		}
		catch (Exception e)
		{
			assertEquals(e.getMessage(),"Can Not Add Negative Number");
		}
	}

	@Test
	public void testHandleAnyAmountOfNumber()
	{
		assertEquals(55, Calculator.add("1,2,3,4,5,6,7,8,9,10"));
	}

	@Test
	public void testStringWithNewLines()
	{
		assertEquals(20,Calculator.add("12\n3\n5"));
	}


	@Test
	public void testAddingDigitWithComma()
	{
		assertEquals(20,Calculator.add("10,10"));
	}

	@Test
	public void testAddStringWithCustomDelimiter() {
		assertEquals(3, Calculator.add("//;\n1;2")); // Using ';' as custom delimiter
	}

}

