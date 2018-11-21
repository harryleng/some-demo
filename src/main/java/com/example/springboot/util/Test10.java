package com.example.springboot.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/4/19
 */
public class Test10
{
    public String load(String url,String  query) throws Exception{
        URL restUrl=new URL(url);
        /*
         * 此处的urlConnection对象实际上是根据URL的请求协议(此处是http)生成的URLConnection类 的子类HttpURLConnection
         */
        HttpURLConnection connection=(HttpURLConnection)restUrl
                .openConnection();
        //请求方式
        connection.setRequestMethod("POST");
        //设置是否从httpUrlConnection读入，默认情况下是true; httpUrlConnection.setDoInput(true);
        connection.setDoOutput(true);
        //allowUserInteraction 如果为 true，则在允许用户交互（例如弹出一个验证对话框）的上下文中对此 URL 进行检查。
        connection.setAllowUserInteraction(false);
        PrintStream printStream=new PrintStream(connection.getOutputStream());
        printStream.println(query);
        printStream.close();
        BufferedReader bf=new BufferedReader(new InputStreamReader(connection
                .getInputStream()));
        String line,resultStr="";
        if (null !=(line=bf.readLine())){

            resultStr+=line;
        }
        System.out.println("3412412---"+resultStr);
        bf.close();
        return resultStr;
    }


    public static void main(String[] args)
    {
        try
        {
            Test10 t=new Test10();
            String load = t.load("http://117.48.215.120:8060/api/getMobileStorageLog",
                    "floor=first&year=2017&month=9&isLeader=N");
            System.out.println(load);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
