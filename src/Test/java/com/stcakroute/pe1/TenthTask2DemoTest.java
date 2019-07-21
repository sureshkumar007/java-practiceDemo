package com.stcakroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TenthTask2DemoTest
{
    TenthTask2Demo tenthTask2Demo;

    @Before
    public void setUp() throws Exception
    {
        this.tenthTask2Demo=new TenthTask2Demo();
    }

    @After
    public void tearDown() throws Exception
    {
        tenthTask2Demo=null;
    }
    @Test
    public void checkString()
    {
        String string=tenthTask2Demo.repeatChar("suresh");
        assertEquals("sureshshsh",string);
    }
    @Test
    public void nullCheck()
    {
        String string=tenthTask2Demo.repeatChar("gopi");
        assertNotNull(string);
    }
}