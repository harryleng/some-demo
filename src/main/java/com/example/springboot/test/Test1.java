package com.example.springboot.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/4/24
 */
public class Test1
{
    public static void main(String[] args)
    {
        Map<String,Integer> map=new HashMap<String,Integer>();
        String str="abcdeefgggwykkkkr";
        String[] split = str.split("");
        for (String s : split)
        {
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        System.out.println(map);

    }
}
