package com.nonenum;

import com.enumlesson.MobileOS;

public class GalaxyS20
{
    private String capacity;
    private String date;
    private MobileOS os;

    public MobileOS getOs()
    {
        return os;
    }

    public void setOs(MobileOS os)
    {
        this.os = os;
    }

    public GalaxyS20()
    {

    }

    public GalaxyS20(String model, String date)
    {
        this.capacity = model;
        this.date = date;
    }

    public String getCapacity()
    {
        return capacity;
    }

    public void setCapacity(String capacity)
    {
        this.capacity = capacity;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }
}
