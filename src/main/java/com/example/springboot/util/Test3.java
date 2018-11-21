package com.example.springboot.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auterAdministratorharryleng
 * @Date:2018/4/17
 */
public class Test3
{
    public static void main(String[] args)
    {
        System.out.println(lentg("pwwwkew"));
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("ss","ss");
        String ss="ss";
        if (!map.containsKey(ss)){
            System.out.println("ss");
        }
    }
    public static int lentg(String str){
        List<String> list=new ArrayList<String>();
        String[] split = str.split("");
        for (String st:split)
        {
            if (list.contains(st)){
               continue;
            }
            list.add(st);
        }
        return list.size();
    }
}
