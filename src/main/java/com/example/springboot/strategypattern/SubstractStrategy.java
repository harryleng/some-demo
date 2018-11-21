package com.example.springboot.strategypattern;

/**
 * @author Administrator
 */
public class SubstractStrategy implements Strategy
{

    @Override
    public void algorithm(int a, int b)
    {
        System.out.println("运算减法........"+(a-b));
    }
}
