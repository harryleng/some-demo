package com.example.springboot.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @auterAdministratorharryleng
 * @Date:2018/5/17
 */
public class Test6
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<Integer>();
        list.add(256);
        list.add(123);
        list.add(1);
        list.add(10);
        list.add(128);
        list.add(512);
        list.add(88);

        Integer a=128;

        Integer b=1;

        if (list.contains(b)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
