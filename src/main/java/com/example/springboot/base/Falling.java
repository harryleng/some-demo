package com.example.springboot.base;

/**
 * @author Administrator
 */
public class Falling
{
    public static void main(String[] args)
    {
        //System.out.println( howmi(100,10));
        distance(100,10);
    }

    private static double howmi(int a,int n){

        double sum=a;

        double amount=a;
        for (int i = 0; i < n-1; i++)
        {
           sum-=sum/2;
            System.out.println(sum);
           amount+=sum*2;

        }
        return amount;
    }

    private static void distance(int h,int n){
            double length=0;

        for (int i = 0; i <n ; i++)
        {
            length+=h;
            h/=2.0;
        }
        System.out.println("经过第"+n+"次反弹后，小球共经过"+length+"米，"+"第"+n+"次反弹高度为"+h
                +"米");
    }
}
