package com.example.springboot.award;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * wchat大转盘抽奖活动
 *
 * @author Administrator
 */
public class BigWheelDrawUtil
{
    private final static List<WchatLotteryDomain> initDrawList = new
            ArrayList<WchatLotteryDomain>()
            {
                {
                    add(new WchatLotteryDomain(1, "500", 1));
                    add(new WchatLotteryDomain(2, "200", 3));
                    add(new WchatLotteryDomain(3, "100", 5));
                    add(new WchatLotteryDomain(4, "5", 11));
                    add(new WchatLotteryDomain(5, "2", 10));
                    add(new WchatLotteryDomain(6, "1", 70));
                }
            };

    public static WchatLotteryDomain generateAward()
    {
        List<WchatLotteryDomain> initDrawList = BigWheelDrawUtil.initDrawList;
        long result = randomNumber(1, 100);
        int line = 0;
        int temp = 0;
        WchatLotteryDomain returnobj =null;
        for (int i = 0; i < initDrawList.size(); i++)
        {
            WchatLotteryDomain obj2=initDrawList.get(i);
            Integer v = obj2.getV();
            temp=temp+v;
            line=100-temp;
            if (v!=0){
                if (result > line && result<=(v+line)){
                    returnobj=obj2;
                    break;
                }
            }
        }
        return returnobj;
    }

    private static long randomNumber(int smin, int smax)
    {
        int range = smax - smin;
        double random = Math.random();
        return (smin + Math.round(random * range));
    }

    public static void main(String[] args)
    {
        System.out.println(JSON.toJSONString(generateAward()));
    }
}
