package com.example.springboot.clone;

/**
 * @author Administrator
 */
public class Student implements Cloneable
{
    private String name;

    private  String age;

    private  String address;

    public Student(String name, String age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Student clone(){

        Student student = null;

        if (student == null){
            try
            {
                student = (Student)super.clone();
            }
            catch (CloneNotSupportedException e)
            {
                e.printStackTrace();
            }
        }
        return  student;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
