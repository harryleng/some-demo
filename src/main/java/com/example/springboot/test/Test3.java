package com.example.springboot.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/4/27
 */
public class Test3 extends Thread
{
    private ServerSocket serverSocket;

    public  Test3(int port){
        try
        {
            serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void  run(){
        while (true){
            try
            {
                System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("远程主机地址： "+server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            }catch (SocketTimeoutException e){
                System.out.println("Socket timed out!");
                break;
            }catch (IOException e){
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        int port = 6066;
        try
        {
            Thread t = new Test3(port);
            t.run();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
