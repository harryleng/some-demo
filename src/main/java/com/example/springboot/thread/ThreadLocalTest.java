package com.example.springboot.thread;

/**
 * @author Administrator
 */
public class ThreadLocalTest
{
    /**
     * (1)打印函数
     * @param str
     */
    static void print(String str){
        //1.1  打印当前线程本地内存中localVariable变量的值
        System.out.println(str + ":" +localVariable.get());        //1.2 清除当前线程本地内存中localVariable变量
        localVariable.remove();
    }

    static ThreadLocal<String> localVariable = new ThreadLocal<String>();

    public static void main(String[] args)
    {
        Thread threadOne=new Thread(
                new Runnable()
                {
                    @Override public void run()
                    {
                        //3.1 设置线程one中本地变量localVariable的值
                        localVariable.set("threadOne local variable");
                        //3.2 调用打印函数
                        print("threadOne");                //3.3打印本地变量值
                        System.out.println("threadOne remove after" + ":" +localVariable.get());
                    }
                 }
        );

        Thread threadTwo=new Thread(
                new Runnable()
                {
                    @Override public void run()
                    {
                        //4.1 设置线程one中本地变量localVariable的值
                        localVariable.set("threadTwo local variable");                //4.2 调用打印函数
                        print("threadTwo");                //4.3打印本地变量值
                        System.out.println("threadTwo remove after" + ":" +localVariable.get());
                    }
                }
        );

        threadOne.start();
        threadTwo.start();
    }
}
