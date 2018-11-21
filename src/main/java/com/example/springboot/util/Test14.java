package com.example.springboot.util;

import java.io.File;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/4/24
 */
public class Test14
{
    public static void main(String[] args)
    {
        String path="D:\\GIT";
        File file=new File(path);
        if (file.isDirectory())
        {
            System.out.println(path+" 是一个目录");
            String[] list = file.list();
            for (int i = 0; i <list.length; i++)
            {
                File f=new File(path+"/"+list[i]);
                if(f.isDirectory()){
                    System.out.println(list[i]+" 是一个目录");
                }else
                {
                    System.out.println(list[i]+" 是一个文件");
                }
            }
        }else {
            System.out.println(path+" 不是一个目录");
        }

    }
}
