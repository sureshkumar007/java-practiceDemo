package com.stcakroute.pe1;
import java.util.*;

public class EigthTask
{
    public static void main(String args[])
    {
       Random random=new Random();
       int ran=random.nextInt(10);
       System.out.println(ran);
       Scanner input=new Scanner(System.in);
        {
            System.out.println("Enter the number between 1 to 100 ");

              boolean win=false;

            while(win!=true)
            {
                int num = input.nextInt();
                if(num==ran)
                {
                    win=true;
                    System.out.println("NUmber matches"+num);
                }
                else if(num>ran)
                {
                    System.out.println("Greater than");
                }
                else if(num<ran)
                {
                    System.out.println("less than");
                }
            }
        }
    }

    public static class TenthTask2 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter string: ");
            String input = s.next();
            StringBuilder output = new StringBuilder(input);
            /*Take number from user*/
            System.out.print("Enter number: ");
            int number = s.nextInt();
            while (number > input.length()) {
                System.out.println("Please enter number less than " + input.length() + ":");
                number = s.nextInt();
            }

            String subString = output.substring(input.length() - number);
            for (int i = 0; i < number; i++) {
                output.append(subString);
            }
    //        output.append(subString.repeat(number));
            System.out.println(output);
            s.close();
        }
    }
}
