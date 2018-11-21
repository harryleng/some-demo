package com.example.springboot.strategypattern;

/**
 * @author Administrator
 */
public class Context
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public  void executeStrategy(int a,int b){
        strategy.algorithm(a,b);
    }
}
