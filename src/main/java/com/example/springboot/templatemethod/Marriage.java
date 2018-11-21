package com.example.springboot.templatemethod;

/**
 * @author Administrator
 */
public abstract class Marriage
{
    abstract void acquaintance();

    abstract void amativeness();

    abstract void marry();

    public void run()
    {
        acquaintance();

        amativeness();

        marry();
    }
}
