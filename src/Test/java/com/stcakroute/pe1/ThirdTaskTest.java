package com.stcakroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdTaskTest
{
    ThirdTask thirdTask;

    @Before
    public void setUp() throws Exception {
        this.thirdTask= new ThirdTask();
    }

    @After
    public void tearDown() throws Exception {
        thirdTask=null;
    }
    @Test
    public void vowelCheckTest()
    {
        String string=thirdTask.vowel("a");
        assertEquals("vowel",string);
    }
    @Test
    public void consonentCheck()
    {
        String string=thirdTask.vowel("z");
        assertEquals("consonent",string);
    }
    @Test
    public void nullCheck()
    {
        String string=thirdTask.vowel("e");
        assertNotNull("vowel",string);
    }
}