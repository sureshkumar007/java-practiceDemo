package com.stcakroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FourthTaskTest {

    @Test
    public void mainFun()
    {
        FourthTask obj=new FourthTask();
        int number1=obj.funMain(3);
        assertEquals(122333,number1);
    }
}