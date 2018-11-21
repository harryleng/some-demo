package com.example.springboot.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @auterAdministratorharryleng
 * @Date:2018/6/7
 */
public class Test9
{
    public static void main(String[] args)
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("type", 1);
        map.put("type1", 2);
        for (Map.Entry<String, Object>  value: map.entrySet())
        {
            System.out.println("========"+value.getKey()+"========"+value.getValue());
        }
        int range = 100 - 50;
        double random = Math.random();
        System.out.println(50+Math.round(random*range));
    }
}
