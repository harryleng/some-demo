package com.example.springboot.test;

import java.math.BigDecimal;
import java.util.Properties;

/**
 * @auterAdministratorharryleng
 * @Date:2018/6/6
 */
public class Test8
{
    public static void main(String[] args)
    {
        int number = 15;
        String string = Integer.toBinaryString(number);
        System.out.println("==============1  "+string);
        number=number >> 6;
        System.out.println("==============2  "+number);
        System.out.println(15/64);
    }
}
