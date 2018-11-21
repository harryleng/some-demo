package com.example.springboot.socket;

import java.io.*;
import java.net.Socket;

/**
 * @author Administrator
 */
public class client
{
    public static void playClient(){

        try
        {
            Socket socket=new Socket("localhost",10086);
            OutputStream out = socket.getOutputStream();
            PrintWriter pw =new PrintWriter(out);
            pw.print("sadasdasdasdasdsadsa");
            pw.flush();
            socket.shutdownOutput();
            InputStream in = socket.getInputStream();
            InputStreamReader is=new InputStreamReader(in);
            BufferedReader bf=new BufferedReader(is);
            String line=null;
            while ((line=bf.readLine())!=null){
                System.out.println("我是客户端，服务器说："+line);
            }
            bf.close();
            is.close();
            in.close();
            out.close();
            pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        playClient();
    }
}
