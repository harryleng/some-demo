package com.example.springboot.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 */
public class server
{


    public static  void palyServer(){
        try
        {
            ServerSocket serverSocket =new ServerSocket(10086);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            InputStreamReader is =new InputStreamReader(inputStream);
            BufferedReader bf=new BufferedReader(is);
            String line=null;
            while ((line=bf.readLine())!=null){
                System.out.println("客户端说:"+line);
            }
            socket.shutdownInput();
            OutputStream out=socket.getOutputStream();
            PrintWriter pw=new PrintWriter(out);
            pw.print("欢迎您");
            pw.flush();
            out.close();
            inputStream.close();
            is.close();
            bf.close();
            pw.close();
            serverSocket.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        palyServer();
        System.out.println( Math.sqrt(100)+""+
        StrictMath.sqrt(100));
    }
}
