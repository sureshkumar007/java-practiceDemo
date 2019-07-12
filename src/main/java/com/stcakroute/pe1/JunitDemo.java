package com.stcakroute.pe1;
import java.lang.*;

public class JunitDemo
{

    public String concatAndUpperCase(String str1,String str2)
    {
        if(str1==null||str2==null)
        {
            return "Null VAlue displayed";
        }
        String concatedString=str1.concat(str2);
        return concatedString.toUpperCase();
    }

    public String reverseString(String string)
    {
       /* String reverse="";
        for(int i=string.length()-1;i>=0;i--)
        {
              reverse=reverse+string.charAt(i);
        }
        return reverse;*/
       StringBuilder stringBuilder=new StringBuilder(null);
       return stringBuilder.reverse().toString();
    }
}
