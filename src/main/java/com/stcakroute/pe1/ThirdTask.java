package com.stcakroute.pe1;

public class ThirdTask
{
    public String vowel(String string)
    {
        //String name="Ap";
        String vowel1="vowel";
        String consonent="consonent";
        String name="";
        for(int i=0;i<string.length();i++)
        {
            switch(string.charAt(i)){
                case 'a'|'A':
                case 'e'|'E':
                case 'i'|'I':
                case 'o'|'O':
                case 'u'|'U':
                    System.out.println("Vowel");
                    name=vowel1;

                    break;
                    default:
                        //System.out.println("consonent");
                        name=consonent;

            }
        }
        return name;
    }

}
