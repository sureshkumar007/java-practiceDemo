package com.stcakroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenCheckTest {

    @Test
    public void mainCheck() {
        OddEvenCheck obj = new OddEvenCheck();
        {
            String var = obj.function(30);
            assertEquals("Tom", var);
        }

       /* @Test
                public void getNullValue()*/

    }
}

