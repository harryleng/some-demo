package com.example.springboot.clone;

import java.io.*;

/**
 * @author Administrator
 */
public class Bag implements Serializable
{
    private static final long serialVersionUID = 5748667216936575088L;

    private String name;

    private String crl;

    private String rongliang;

    public Bag(String name, String crl, String rongliang)
    {
        this.name = name;
        this.crl = crl;
        this.rongliang = rongliang;
    }

    @Override
    public Bag clone(){

        Bag bag = null;
        if (bag == null){
            try
            {
                //将对象序列化到流里
                ByteArrayOutputStream out=new ByteArrayOutputStream();
                ObjectOutputStream obj =new ObjectOutputStream(out);
                obj.writeObject(this);

                ByteArrayInputStream input=new ByteArrayInputStream(out.toByteArray());
                ObjectInputStream obin=new ObjectInputStream(input);
                bag=(Bag)obin.readObject();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        return  bag;

    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Bag{");
        sb.append("name='").append(name).append('\'');
        sb.append(", crl='").append(crl).append('\'');
        sb.append(", rongliang='").append(rongliang).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
