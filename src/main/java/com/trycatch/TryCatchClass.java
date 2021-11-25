package com.trycatch;

public class TryCatchClass
{
    public static void main(String[] args)
    {
        try
        {
            int a = 9 / 0;
            System.out.println("Sonuc: " + a);
        } catch (Exception e)
        {
            System.out.println("Error bro: " + e);
        } finally
        {
            System.out.println("Always do this");
        }   System.out.println("Continue...");


    }
}
