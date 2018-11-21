package com.example.springboot.util;

class Base{


}

class Chilld extends Base{


}


public class Test {
    public static void main(String[] args) {
           Chilld c= new Chilld();
            if (c instanceof  Base){
                System.out.println("ok");
            }else {
                System.out.println("not ok");
        }
    }
}
