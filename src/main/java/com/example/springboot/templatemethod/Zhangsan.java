package com.example.springboot.templatemethod;

/**
 * @author Administrator
 */
public class Zhangsan extends Marriage
{
    @Override
    void acquaintance()
    {
        System.out.println("在龙岗相识");
    }

    @Override
    void amativeness()
    {
        System.out.println("在南山热恋");
    }

    @Override
    void marry()
    {
        System.out.println("在福田结婚");
    }
}
