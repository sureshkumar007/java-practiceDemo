package com.stcakroute.practice;
import java.util.*;

public class SeventhTask
{
    public static void main(String args[])
    {
        int a[]=new int[100];
        int temp,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len=input.nextInt();
        for(int i=0;i<len;i++)
        {
            a[i]=input.nextInt();
        }
        for(int j=0;j<a.length-1;j++)
        {
            for(int z=j+1;z<a.length;z++)
            {
                if(a[j]<a[z])
                {
                   temp=a[z];
                   a[z]=a[j];
                   a[j]=temp;
                }
            }
        }
        System.out.println("After Sorting");
        for(int x=0;x<len;x++)
        {
            System.out.println(a[x]);
        }
        for(int i=0;i<len;i++)
        {
            if(a[i]/2==0)
            {
               sum=sum+a[i];
            }
        }
        System.out.println("Sum of even"+sum);
        if(sum>15)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
