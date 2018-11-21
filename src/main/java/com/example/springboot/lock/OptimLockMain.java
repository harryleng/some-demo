package com.example.springboot.lock;

import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 */
public class OptimLockMain
{
    static int version=1;

    static String file="C:\\Users\\Administrator\\Desktop\\document\\20180502"
            + "\\lock.txt";

    public static int getVersion()
    {
        return version;
    }

    public static String getFile()
    {
        return file;
    }

    public static int updateVersion()
    {
        return version+=1;
    }
    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            new OptimThread(String.valueOf(i),getVersion(),file).start();
//        }
        String a="10086";
        List<String> list = Arrays.asList(a);
        String string = list.toString();
        System.out.println(string);
    }
}
