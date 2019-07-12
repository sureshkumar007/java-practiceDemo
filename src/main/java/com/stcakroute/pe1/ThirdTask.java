package com.stcakroute.pe1;

public class ThirdTask
{
    public static void main(String args[])
    {
        String name="Ap";
        for(int i=0;i<name.length();i++)
        {
            switch(name.charAt(i)){
                case 'a'|'A':
                case 'e'|'E':
                case 'i'|'I':
                case 'o'|'O':
                case 'u'|'U':
                    System.out.println("Vowel");
                    break;
                    default:
                        System.out.println("consonent");

            }
        }
    }

}
