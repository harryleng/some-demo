package com.example.springboot.disignpattern;

/**
 * @author Administrator
 */
public class Singleton
{
    private  static Singleton singleton = null;

    private Singleton (){

    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public Object reslover(){
        return  singleton;
    }
}
