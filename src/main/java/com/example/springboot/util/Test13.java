package com.example.springboot.util;

import java.io.*;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/4/24
 */
public class Test13
{
    public static void main(String[] args)
    {
       try
       {
           byte b [] ={11,21,3,40,5};

           OutputStream out=new FileOutputStream("test.text");
           OutputStreamWriter os=new OutputStreamWriter(out,"UTF-8");
           for (int i = 0; i < b.length; i++)
           {
               os.write(b[i]);
           }
           os.close();
           InputStream in=new FileInputStream("test.text");
           InputStreamReader is=new InputStreamReader(in,"UTF-8");
           int size = in.available();
           for (int i = 0; i < size; i++)
           {
               System.out.println((char) is.read()+"  ");
           }
        in.close();
           is.close();
       }catch (IOException e){
          e.printStackTrace();
       }
    }
}
