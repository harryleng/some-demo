package com.example.springboot.base;

/**
 * @auterAdministratorharryleng
 * @Date:2018/6/28
 */
public class Daffodils
{
    public static void main(String[] args)
    {

        System.out.println(isDaffodils(8761));
    }

    private static boolean isDaffodils(int a){
        boolean flag=true;
        int bai=a/100;
        System.out.println("bai="+bai);
        int ge=a%10;
        System.out.println("ge="+ge);
        int y=a/10;
        int shi=y%10;
        System.out.println("shi="+shi);
        if ((bai*bai*bai+ge*ge*ge+shi*shi*shi)==a)
        {

        }else {
            flag=false;
        }
        return flag;
    }
}
