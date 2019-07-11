package com.stcakroute.practice;
import java.util.*;
import java.lang.*;

public class SixthTask
{
    public static void main(String args[])
    {
        char ch;
        Scanner input=new Scanner(System.in);
        {

            System.out.println("Enter the character to check Upper or Lower case");
            ch=input.next().charAt(0);
              /* if((ch>='A')&&(ch<='Z'))
               {
                   System.out.println("Capital letter");
               }
               else
               {
                   System.out.println("Lower case");
               }*/

              if((ch>=65)&&(ch<=90))
              {
                  System.out.println("Capital Letter");
              }
              else if((ch>=97)&&(ch<=122))
              {
                  System.out.println("Lower case");
              }
              else if((ch>=48)&&(ch<=57))
              {
                  System.out.println("Number");
              }
              else
              {
                  System.out.println("Special Symbol");
              }


        }
    }

}
