package com.stcakroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class OddEvenCheckTest {
    OddEvenCheck obj = new OddEvenCheck();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Before
    public void setUp() {
        System.out.println("Inside Before");
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
    }

    @Test
    public void mainCheck()

        {
            String var = obj.function(30);
            assertEquals("Tom", var);
            //System.out.println("Tom");
            assertNotNull(var);
        }

        @Test
        public void getNullValue()
        {
            String var1 = obj.function(19);
            assertEquals("The enter number is below 20", var1);
        }



}
