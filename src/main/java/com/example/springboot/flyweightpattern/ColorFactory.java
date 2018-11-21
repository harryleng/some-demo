package com.example.springboot.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
public class ColorFactory
{
    private static  final Map<String,Color> map=new HashMap<String, Color>();

    public static Color getColor(String name){
        Color color = map.get("name");
        if (null == color){
            System.out.println("颜色不存在，创建一个放入缓存中..............");
            color=new ColorCache(name);
            map.put(name,color);
        }
        return  color;
    }
}
