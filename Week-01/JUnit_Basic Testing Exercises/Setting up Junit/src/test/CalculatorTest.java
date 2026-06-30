package test;

import static org.junit.Assert.*;


import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddition() {

        int a = 10;
        int b = 20;

        int result = a + b;

        assertEquals(30, result);
    }

}
