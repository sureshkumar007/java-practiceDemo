package com.stcakroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NinthTaskTest
{
    NinthTask ninthTask;
    @Before
    public void setUp()
    {
        this.ninthTask=new NinthTask();
    }
    @After
    public void tearDown()
    {
        ninthTask=null;
    }
    @Test
    public void reverseCheck()
    {
        String str=ninthTask.reverse("london");
        assertEquals("nodnol",str);

    }
    @Test
    public void reverseCheckNull()
    {
        String str=ninthTask.reverse("saras");
        assertEquals("saras",str);
    }

    @Test
    public void reverseCheckTo()
    {
        String str=ninthTask.reverse("suresh");
        assertNotEquals("suresh",str);
    }

}