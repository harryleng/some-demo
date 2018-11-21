package com.example.springboot.util;

import java.util.Scanner;

/**
 * @auterAdministratorharryleng
 * @Date:2018/4/11
 */
public class Test1
{
    public static void main(String[] args)
    {
//        System.out.println("输入下划线格式");
//        Scanner sacn=new Scanner(System.in);
//        String arg=sacn.nextLine();
//        String [] a=arg.split("_");
//        StringBuffer sb=new StringBuffer();
//        for(String str: a){
//            if (sb.length()==0){
//                sb.append(str.toLowerCase());
//            }else{
//                sb.append(str.substring(0,1).toUpperCase());
//                sb.append(str.substring(1).toLowerCase());
//            }
//        }
//        System.out.println(sb.toString());
        String mobile="13430652526";
         mobile = mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
         System.out.println(mobile);
    }
}
