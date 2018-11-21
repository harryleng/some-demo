package com.example.springboot.base;

import java.util.Scanner;


/**
 * @author Administrator
 */
public class Conversion
{
    public static void main(String[] args)
    {
        System.out.println("输入一串字符");
        Scanner scan=new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        count(str);
    }

    private static void count(String str)
    {
        int kongge=0;

        int zhongwen=0;

        int zimu=0;

        int shuzi=0;

        int qita=0;

        String  kg="\\s";

        String  zw="[\u4e00-\u9fa5]";

        String  sz="[0-9]";

        String  zm="[a-zA-Z]";

        char[] chars = str.toCharArray();

        String [] strings =new String[chars.length];

        for (int i = 0; i < chars.length; i++)
        {
            strings[i]=String.valueOf(chars[i]);
        }
        for (String string : strings)
        {
            if (string.matches(kg)){
                kongge+=1;
            }
            if (string.matches(zw)){
                zhongwen+=1;
            }
            if (string.matches(zm)){
                zimu+=1;
            }
            if (string.matches(sz)){
                shuzi+=1;
            }else {
                qita+=1;
            }
        }
        System.out.println("汉字有"+zhongwen+"个，"+"字母有"+zimu+"个，"+"空格有"+kongge
                +"个，"+"数字有"+shuzi+"个，"+"其他有"+qita+"个，");

    }
}
