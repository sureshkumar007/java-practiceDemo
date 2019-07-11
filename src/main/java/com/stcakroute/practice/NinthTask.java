package com.stcakroute.practice;
import java.lang.String;
import java.util.*;
public class NinthTask
{
    public static void main(String args[]) {

        String name;
        String rev = " ";
        Scanner input = new Scanner(System.in);
        {
             System.out.println("Enter the string");
             name=input.nextLine();

            int length = name.length();


            for (int i = length - 1; i >= 0; i--) {
                rev = rev + name.charAt(i);
            }
            System.out.println(rev);

        }
    }

}
