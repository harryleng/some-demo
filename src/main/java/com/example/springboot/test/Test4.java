package com.example.springboot.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @auterAdministratorharryleng
 * @Date:2018/4/28
 */
public class Test4
{
    public static void main(String[] args)
    {
        char c;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

       try
       {
           do
           {
               c=(char)bf.read();
               System.out.println(c);

           }while (c!='q');
       }catch (Exception e){
           e.printStackTrace();
       }

    }
}
