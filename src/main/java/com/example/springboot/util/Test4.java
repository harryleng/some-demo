package com.example.springboot.util;

/**
 * @auterAdministratorharryleng
 * @Date:2018/4/17
 */
public class Test4
{
    public static void main(String[] args)
    {
        Thread t=new Thread(){
          @Override
          public void  run(){
              pong();
          }
        };
        t.start();
        t.run();
        System.out.println("ping");
    }
    static void pong(){
        System.out.println("pong");
    }
}
