package com.example.springboot.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @auterAdministratorharryleng
 * @Date:2018/4/19
 */
public class Test8
{
    public static void main(String[] args)
    {
        List list=new ArrayList();
        list.add(123);
        list.add(23);
        list.add(33);
        list.add(43);
        list.add(53);
        List list2 = Collections.synchronizedList(list);
        System.out.println(list2);
    }
}
