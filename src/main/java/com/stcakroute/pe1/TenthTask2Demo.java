package com.stcakroute.pe1;
import java.util.*;
public class TenthTask2Demo
{
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string: ");
//        String input = s.next();
//        StringBuilder output = new StringBuilder(input);
//        /*Take number from user*/
//        System.out.print("Enter number: ");
//        int number = s.nextInt();
//        while (number > input.length()) {
//            System.out.println("Please enter number less than " + input.length() + ":");
//            number = s.nextInt();
//        }
//
//        String subString = output.substring(input.length() - number);
//        for (int i = 0; i < number; i++) {
//            output.append(subString);
//        }
//
//        System.out.println(output);
//        s.close();
//    }


    public String repeatChar(String string)
    {
        StringBuilder output = new StringBuilder(string);
        int number=2;
        String string1="";
        while (number > string.length()) {
           System.out.println("Please enter number less than " + string.length() + ":");
//            number = s.nextInt();

       }

        String subString = output.substring(string.length() - number);
        for (int i = 0; i < number; i++) {
            output.append(subString);

        }

        System.out.println(output);

           // string1=output;
        return String.valueOf(output);

    }


}
