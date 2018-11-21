package com.example.springboot.strategypattern;

/**
 * @author Administrator
 */
public class StrategyDemo
{
    public static void main(String[] args)
    {
        Context context=new Context(new AdditionStrategy());
        context.executeStrategy(1,2);

        Context context1=new Context(new SubstractStrategy());
        context1.executeStrategy(1,2);
    }
}
