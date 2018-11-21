package com.example.springboot.base;

/**
 * @auterAdministratorharryleng
 * @Date:2018/6/28
 */
public class primeNumber
{
    public static void main(String[] args)
    {

        cont(10,50);
    }

    private static void cont(int a,int b){
         int count =0;
        for (int i = a; i < b; i++)
        {
            boolean prime = isPrime(i);
            if (prime){
                count++;
                System.out.println(i+"是素数。。。。");
                System.out.println();
            }
        }
        System.out.println("总共"+count);
    }

    private static boolean isPrime(int c){

        boolean flag=true;
        if (c==1){
            flag =false;
        }else {
            for (int i = 2; i <=Math.sqrt(c) ; i++)
            {
                if ((c%i)==0 || c==1){
                    flag =false;
                    break;
                }
                else {
                    flag=true;
                }
            }
        }

        return flag;
    }

}
