package com.stcakroute.pe1;

import org.junit.*;

import java.lang.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;

    @Before
    public void setUp() {
        System.out.println("Inside before");
        this.junitDemo = new JunitDemo();
        //JunitDemo junitDemo = new JunitDemo();
    }

    @After
    public void teardown() {
        System.out.println("Inside after");
        junitDemo = null;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Inside before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void givenStringShouldGiveReverse() {
        // String actualResults=junitDemo.reverseString("hello");
        //assertEquals("olleh",actualResults);
        System.out.println("First test case");
    }

    @Test
    public void givenNullValue() {
        System.out.println("Second test case");
    }


    /*@Test
    public void givenTwoStringShouldReturnConcatedUpperString() {
        //arrange
        //  JunitDemo junitDemo = new JunitDemo();
        //act
        String result = junitDemo.concatAndUpperCase("Hello ", "world");
        //assert
        assertEquals("HELLO WORLD", result);
        assertNotNull(result);
    }

    @Test
    public void givenTwoStringShouldReturnConcatedUpperStringError() {
        //arrange
        JunitDemo junitDemo = new JunitDemo();
        //act
        String result = junitDemo.concatAndUpperCase("Hello ", null);
        //assert
        assertEquals("Null VAlue displayed", result);
        assertNotNull(result);
    }
    @Test(expected=NullPointerException.class)
    public void givenStringNullException()
    {
        String results=junitDemo.reverseString(null);
    }
*/

}