package com.example.springboot.proxypattern;

/**
 * @author Administrator
 */
public class StatiDemo
{
    public static void main(String[] args)
    {
        FetchDb fetchDb=new UserServiceProxy(new UserService());
        fetchDb.query();
    }
}
