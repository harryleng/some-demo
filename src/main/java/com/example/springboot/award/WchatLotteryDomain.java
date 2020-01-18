package com.example.springboot.award;

import java.io.Serializable;

/**
 *
 * @author harryleng
 */
public class WchatLotteryDomain implements Serializable
{
    private static final long serialVersionUID = 8083215461302365272L;

    private Integer id;

    private String prize;

    private Integer v;

    public WchatLotteryDomain(Integer id, String prize, Integer v)
    {
        this.id = id;
        this.prize = prize;
        this.v = v;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getPrize()
    {
        return prize;
    }

    public void setPrize(String prize)
    {
        this.prize = prize;
    }

    public Integer getV()
    {
        return v;
    }

    public void setV(Integer v)
    {
        this.v = v;
    }
}
