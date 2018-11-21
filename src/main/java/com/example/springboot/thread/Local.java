package com.example.springboot.thread;

/**
 * @author Administrator
 */
public class Local extends ThreadLocal
{
    @Override
    public void set(Object value)
    {
        super.set(value);
    }
}
