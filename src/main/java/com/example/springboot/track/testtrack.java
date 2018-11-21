package com.example.springboot.track;

import java.util.Stack;

/**
 * @auterAdministratorharryleng
 * @Date:2018/6/27
 */
public class testtrack<T>
{
    private static int index=0;

    public static void call(){
        index++;
        call();
    }

    private Stack<T> input=new Stack<T>();

    private Stack<T> out=new Stack<T>();

    public T getStack(){
        T push=null;
        if (!out.empty()){
            if (input.empty()){
                 push = input.push(out.pop());
            }
        }
        return push;
    }



    public static void main(String[] args)
    {

        try
        {
            call();
        }catch (Throwable e){
            System.out.println("index is "+ index);
        }
    }

}
