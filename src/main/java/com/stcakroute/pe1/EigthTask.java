package com.stcakroute.pe1;
import java.util.*;

public class EigthTask
{
    public  String mainFunction(int num)
    {
       Random random=new Random();
       int ran=random.nextInt(10);
       System.out.println(ran);
       boolean win=false;

            while(win!=true)
            {

                if(num==ran)
                {
                    win=true;
                    return "NUmber matches";
                }
                else if(num>ran)
                {
                    return "Greater than";
                }
                else if(num<ran)
                {
                    return "less than";
                }
                else {
                    return "not matched";
                }
            }
            return "not null";
        }
    }

