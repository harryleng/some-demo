package com.example.springboot.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/4/19
 */
public class Test9
{
    public static void main(String[] args)
    {
        try
        {
            URL url=new URL("http://admin-alpha.loobool.com/agentManagement");
            URLConnection urlConnection=url.openConnection();
            HttpURLConnection httpURLConnection=null;
            if (urlConnection instanceof HttpURLConnection){
                httpURLConnection=(HttpURLConnection)urlConnection;
            }else {
                System.out.println("请输入 URL 地址");
                return;
            }
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream()));
            String urlString = "";
            String current;
            while((current = in.readLine()) != null)
            {
                urlString += current;
            }
            System.out.println(urlString);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
