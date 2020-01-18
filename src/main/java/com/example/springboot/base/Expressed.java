package com.example.springboot.base;

import java.util.Scanner;

/**
 * @author harryleng
 */
public class Expressed
{
    public static void main(String[] args)
    {
        System.out.println("求a+aa+aaa+aaaa+aaaa的值，输入");
        Scanner scanner=new Scanner(System.in).useDelimiter("\\s*");
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        expressed(a,n);
        System.out.print("="+result(a,n));
    }

    private static  void expressed(int a,int n){
        StringBuffer sb=new StringBuffer();
        StringBuffer buffer=new StringBuffer();
        for (int i = 0; i <n ; i++)
        {
            sb.append(a);
            if (i!=n-1){
                buffer.append(sb+"+");
            }else {
                buffer.append(sb);
            }
        }
        System.out.println(buffer.toString());
    }

    private static long result(int a,int n){

        int SUM=0;

        int subSUM=0;
        for (int i = 1; i <=n ; i++)
        {
            SUM=SUM*10+a;
            subSUM+=SUM;
        }
        return  subSUM;

    }
}
