package com.example.springboot.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @auterAdministratorharryleng
 * @Date:2018/5/24
 */
public class Test7
{
    public static void main(String[] args)
    {

        List list=new ArrayList();
        list.add(256);
        list.add(123);
        list.add(1);
        List list2=new ArrayList(list);
        list2.add("154");
        list2.add(list);
        System.out.println(list2.size());
    }
}
