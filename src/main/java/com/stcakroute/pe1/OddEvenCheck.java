package com.stcakroute.pe1;
import java.util.*;
import java.lang.String;
public class OddEvenCheck
{

    public String  function(int number) {

        if ((number % 2 == 0) && (number >= 20 && number <= 30)) {
            //  System.out.println("Jerry"+number);
            return "Tom";
        } else if (((number % 2) != 0) && (number >= 20 && number <= 30))
        {
            //System.out.println("TOM"+number);
            return "Jerry";

        }

  else
            {
                return "The enter number is below 20";
            }
    }

    }





