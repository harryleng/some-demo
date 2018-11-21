package com.example.springboot.util;

/**
 * @auterAdministratorharryleng
 * @Date:2018/4/19
 */
public class Test7
{
    public static void main(String[] args)
    {
        String str=new String("AB");
        String str1 = str;
        String str2 ="A";
        String str3 = str2+"B";
        String str4="AB";
        System.out.println(str==str1);
        System.out.println(str==str3);
        System.out.println(str==str4);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
    }
}
