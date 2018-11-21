package com.example.springboot.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Administrator
 */
public class myServer extends ServerSocket
{
    public static final int SERVER_PROT = 10000;

    public myServer() throws IOException
    {
        super(SERVER_PROT);
        try
        {
            Socket socket = accept();
            new CreateServerThread(socket);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }finally
        {
            close();
        }
    }
}

class CreateServerThread extends Thread
{
    private Socket client;

    private BufferedReader in;

    private PrintWriter out;

    public CreateServerThread(Socket socket) throws IOException
    {
        client=socket;
        in=new BufferedReader(new InputStreamReader( client.getInputStream(),"GB2312"));
        out =new PrintWriter(client.getOutputStream(),true);
        out.println("--- Welcome ---"+in.readLine());
        start();
    }

    @Override
    public void  run(){
       try
       {
           String line=in.readLine();
//           while (!line.equals("bye")){
               String msg = createMessage(line);

               out.println(msg);

               line = in.readLine();
//           }
           out.println("--- See you, bye! ---"+line);
           client.close();
       }catch (IOException e){
           e.printStackTrace();
       }

    }

    private String createMessage(String line) throws IOException
    {
        while ((line=in.readLine())!=null){
            return  line;
        }
        return null;
    }

    public static void main(String[] args)throws IOException
    {
        new myServer();
    }
}
