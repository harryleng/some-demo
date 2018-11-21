package com.example.springboot.templatemethod;

/**
 * @author Administrator
 */
public class LiSi extends  Marriage
{
    @Override
    void acquaintance()
    {
        System.out.println("在西班牙相遇");
    }

    @Override
    void amativeness()
    {
        System.out.println("在阿根廷热恋");
    }

    @Override
    void marry()
    {
        System.out.println("在巴西结婚");
    }
}
