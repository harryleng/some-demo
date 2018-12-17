package com.example.springboot.AI;

import java.util.Scanner;

/**
 * @author Administrator
 * @auterAdministratorharryleng
 * @Date:2018/12/17
 */
public class MainAi
{
    public static void main(String[] args)
    {
        System.out.println("请输入.....");
        Scanner scanner =new Scanner(System.in);
        String str;
        while (true){
            str = scanner.next();
            str = str.replace("吗","");
            str = str.replace("？","！");
            str = str.replace("?","!");
            System.out.println(str);
        }
    }
}
