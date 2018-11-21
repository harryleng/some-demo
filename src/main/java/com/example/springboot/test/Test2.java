package com.example.springboot.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/4/27
 */
public class Test2
{

    public static void main(String[] args)
    {
        String serverName = "192.168.1.112";
        int port =6066;
        try
        {
            System.out.println("连接到远程主机："+serverName+"端口"+port);
            Socket client=new Socket(serverName,port);
            System.out.println("远程主机地址"+client.getRemoteSocketAddress());
            OutputStream outputStream = client.getOutputStream();

            DataOutputStream outputStream1=new DataOutputStream(outputStream);
            outputStream1.writeUTF("Hello from" +client.getLocalSocketAddress());
            InputStream inputStream=client.getInputStream();
            DataInputStream dataInputStream=new DataInputStream(inputStream);
            System.out.println("服务器响应 "+dataInputStream.readUTF());
            client.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
