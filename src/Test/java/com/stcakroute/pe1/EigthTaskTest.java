package com.stcakroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class EigthTaskTest {
   //arrange
    EigthTask obj=new EigthTask();

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
    public void mainfun()
    {
      //act
      String string=obj.mainFunction(5);
      //assert
        assertEquals("Greater than",string);
      /*  assertEquals("less than",string);
        assertEquals("NUmber matches",string);
        assertEquals("not matched",string);
        assertEquals("not null",string);*/


    }
}