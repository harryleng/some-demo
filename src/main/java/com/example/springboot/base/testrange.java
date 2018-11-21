package com.example.springboot.base;

/**
 * @author Administrator
 */
public class testrange
{
    public static void main(String[] args)
    {
        Other other = new Other();
        new testrange().addOne(other);
    }

    public void addOne(  final Other other)
    {
        other.i++;
    }
}

class Other
{
    public  int i =0;
}