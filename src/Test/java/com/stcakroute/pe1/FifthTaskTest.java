package com.stcakroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FifthTaskTest
{
FifthTask fifthTask;
@Before
    public void setUp()
{
    fifthTask=new FifthTask();
}
@After
    public void tearDown()
{
    fifthTask=null;
}
@Test
public void sumOfTest()
{
    int arr[]={10,20,30};
    int addof=fifthTask.sumOfAll(arr);
    assertEquals(60,addof);
}
@Test
    public void sumOfnotNull()
{
    int arr[]={2,3,4};
    int addof=fifthTask.sumOfAll(arr);
    assertNotNull(addof);
}
@Test
    public void sumOfCheck()
{
    int arr[]={1,2,3};
    int addof=fifthTask.sumOfAll(arr);
    assertNotEquals(5,addof);
}



}