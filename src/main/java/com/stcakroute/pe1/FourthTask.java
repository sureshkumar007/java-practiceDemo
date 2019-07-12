package com.stcakroute.pe1;
import java.util.*;
public class FourthTask
{
    public static void main(String args[])
        {
            Scanner input=new Scanner(System.in);
            {
                int number;
                System.out.println("Enter the number");
                number=input.nextInt();
                for(int i=1;i<=number;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(" "+i);
                    }
                }
            }
    }

}
