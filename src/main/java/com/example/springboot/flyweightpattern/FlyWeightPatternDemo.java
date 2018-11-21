package com.example.springboot.flyweightpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class FlyWeightPatternDemo
{

    public static void main(String[] args)
    {
        List<String> name=new ArrayList<String>();
        name.add("红色");
        name.add("黄色");
        name.add("蓝色");
        name.add("紫色");
        name.add("红色");
        name.add("绿色");
        for (String s : name)
        {
            Color color=   ColorFactory.getColor(s);
            color.print();
        }
    }
}
