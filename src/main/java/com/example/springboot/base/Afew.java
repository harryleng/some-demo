package com.example.springboot.base;

/**
 * @auterAdministratorharryleng
 * @Date:2018/6/28
 */
public class Afew
{
    public static void main(String[] args)
    {

        System.out.println(13%5);
    }

    private static void maxAfew(int n,int m){
            int temp=1;

            int yushu=1;

            int beishu=1;

            if (n<m){

                temp=n;

                n=m;

                m=temp;
            }
            while (m!=0){
                temp =n%m;

                 n=m;

            }


    }

}
