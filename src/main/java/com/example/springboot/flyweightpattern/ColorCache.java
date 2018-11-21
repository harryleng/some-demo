package com.example.springboot.flyweightpattern;

/**
 * @author Administrator
 */
public class ColorCache implements Color
{
    private  String name;

    public ColorCache(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void print()
    {
        System.out.println("颜色是.........."+name);
    }
}
