package com.example.springboot.test;

/**
 * @auterAdministratorharryleng
 * @Date:2018/5/11
 */
public class SingleTon
{
    private  static  final SingleTon SINGLE_TON=new SingleTon();

    private  SingleTon(){}

    public  static  SingleTon  getInstance(){

       return SINGLE_TON;
    }
}
