package com.stcakroute.practice;

import java.util.Scanner;

public class FifthTask
{
    public static  void main(String args[])
    {
        int count,sum=0;
        Scanner input=new Scanner(System.in);
        {
            count=input.nextInt();
            int a[]=new int[100];

            for(int i=0;i<count;i++)
            {
                a[i]=input.nextInt();
                sum=sum+a[i];
            }
            System.out.println(sum);

        }
    }

}
