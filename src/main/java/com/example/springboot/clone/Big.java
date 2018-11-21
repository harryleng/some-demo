package com.example.springboot.clone;

import java.io.*;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/9/18
 */
public class Big implements Serializable
{

    private static final long serialVersionUID = 7005083416970139718L;

    private  String name;

    private  String address;

    private  Integer age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Override public String toString()
    {
        StringBuilder sb = new StringBuilder("Big{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public  Object clone(){

        Big big = null;
        if (big == null){

            try
            {
                ByteArrayOutputStream out=new ByteArrayOutputStream();
                ObjectOutputStream object=new ObjectOutputStream(out);

                object.writeObject(this);

                ByteArrayInputStream bai=new ByteArrayInputStream(out.toByteArray());

                ObjectInputStream inputStream=new ObjectInputStream(bai);
                 big=(Big)inputStream.readObject();
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
        return  big;
    }
}
