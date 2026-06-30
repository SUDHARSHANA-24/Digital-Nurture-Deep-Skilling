package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAAPatternTest {

    private int a;
    private int b;

    @Before
    public void setUp() {
        System.out.println("Setup Method Executed");
        a = 10;
        b = 20;
    }

    @Test
    public void testAddition() {

        // Arrange
        int expected = 30;

        // Act
        int actual = a + b;

        // Assert
        assertEquals(expected, actual);

        System.out.println("Test Executed");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Method Executed");
    }
}