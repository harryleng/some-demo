package com.example.springboot.strategypattern;

/**
 * @author Administrator
 */
public class AdditionStrategy implements Strategy
{

    @Override
    public void algorithm(int a, int b)
    {
        System.out.println("运算加法.....="+(a+b));
    }
}
