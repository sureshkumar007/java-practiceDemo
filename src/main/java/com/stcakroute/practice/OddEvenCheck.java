package com.stcakroute.practice;
import java.util.*;
public class OddEvenCheck
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        {
            int number;
            System.out.println("Enter number");
            number=input.nextInt();
            if((number%2==0)&&(number>=20&&number<=30))
            {
                System.out.println("Jerry"+number);
            }
            else if(((number%2)!=0)&&(number>=20&&number<=30))
            {
                System.out.println("TOM"+number);
            }
            else
            {
                System.out.println("The enter number is below 20");
            }
        }

    }


}
