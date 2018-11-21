package com.example.springboot.base;

/**
 * @auterAdministratorharryleng
 * @Date:2018/6/28
 */
public class rabbit
{
    public static void main(String[] args)
    {
        System.out.println(info(3));
    }
    private static int info(int a){
        if ( a==1 || a==2){
            return 1;
        }else {
            return info(a-1)+info(a-2);
        }

    }
}
