package com.example.springboot.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @auterAdministratorharryleng
 * @Date:2018/5/2
 */
public class Test5
{
    public static void main(String[] args)
    {
        String string="adsasdadsa4441245";
       try
       {
           InputStream inputStream=new ByteArrayInputStream(string.getBytes("UTF-8"));
       }catch (Exception e){
           e.printStackTrace();
       }
       String path="m_power/setAdmin";
        String substring = path.substring(path.indexOf("/"));
        System.out.println("=========="+substring);
    }
}
