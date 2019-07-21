package com.stcakroute.pe1;

import java.util.Scanner;

public class FifthTask
{
    public int  sumOfAll(int[] number)
    {
        int count,sum=0;
//        Scanner input=new Scanner(System.in);
//        {
//            count=input.nextInt();
//            int a[]=new int[100];

            for(int i=0;i<number.length;i++)
            {

                sum=sum+number[i];
            }
            System.out.println(sum);
            return sum;

        }
    }


