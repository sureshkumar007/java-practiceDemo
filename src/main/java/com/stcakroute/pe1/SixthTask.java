package com.stcakroute.pe1;
import java.util.*;
import java.lang.*;

public class SixthTask
{
    public String CaseChechecker(char ch)
    {
        String string="";



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
                  string="capital letter";
                  return string;
              }
              else if((ch>=97)&&(ch<=122))
              {
                  System.out.println("Lower case");
                  string="lower case";
                  return string;
              }
              else if((ch>=48)&&(ch<=57))
              {
                  System.out.println("Number");
                  string="number";
                  return string;
              }
              else
              {
                  System.out.println("Special Symbol");
                  string="special symbol";
                  return string;
              }


        }
    }


