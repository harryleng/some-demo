package com.example.springboot.proxypattern;

/**
 * @author Administrator
 */
public class UserServiceProxy implements FetchDb
{
    private UserService userService;

    public UserServiceProxy (UserService userService){
        this.userService=userService;
    }

    @Override
    public void query()
    {
        System.out.println("开启事物............");
        userService.query();
        System.out.println("关闭事物.....");
    }
}
