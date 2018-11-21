package com.example.springboot.util;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/4/18
 */
public class Test5
{
    public static void main(String[] args)
    {
        String str="您好，你的投放点@里的商品@@已低于库存预警数@@@，当前库存数为@@@@，请及时安排进行补货，以免影响用户购买体验。";
        String sb = str.replaceFirst("@", "韩国棒子").replaceFirst("@@", "王老吉")
                .replaceFirst("@@@", "10").replaceFirst("@@@@", "5");
        System.out.println(sb);
        Integer a=10,b=10,c=150,d=150;
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
    }
}
