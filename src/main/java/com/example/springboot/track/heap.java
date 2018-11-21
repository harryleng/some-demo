package com.example.springboot.track;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @auterAdministratorharryleng
 * @Date:2018/6/27
 */
public class heap
{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args)
    {
        List<byte []> list=new ArrayList<byte[]>();
        int i=0;
        boolean flag=true;
        while (flag){
         try
         {
             i++;
             list.add(new byte[1024*1024]);
         }catch (Throwable throwable){
             throwable.printStackTrace();
             flag=false;
             System.out.println("count "+i);
         }
        }
    }
}
