package com.example.springboot.proxypattern;

/**
 * @author Administrator
 */
public class UserService implements FetchDb
{
    @Override
    public void query()
    {
        System.out.println("UserService query.....");
    }
}
