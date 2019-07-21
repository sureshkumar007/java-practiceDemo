package com.stcakroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SixthTaskTest
{
    SixthTask sixthTask;

    @Before
    public void setUp() throws Exception
    {
        sixthTask=new SixthTask();
    }

    @After
    public void tearDown() throws Exception
    {
        sixthTask=null;
    }
    @Test
    public void upperCaseCheck()
    {
        String string=sixthTask.CaseChechecker('a');
        assertEquals("lower case",string);
    }
    @Test
    public void lowercase()
    {
        String string=sixthTask.CaseChechecker('A');
        assertEquals("capital letter",string);
        String string1=sixthTask.CaseChechecker('6');
        assertEquals("number",string1);
        String string2=sixthTask.CaseChechecker('@');
        assertEquals("special symbol",string2);
    }
}