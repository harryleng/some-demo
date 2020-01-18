package com.example.springboot.base;

/**
 * @author harryleng
 * @auterAdministratorharryleng
 * @Date:2018/6/28
 */
public class PrimeFactors
{
    public static void main(String[] args)
    {
        decomposition(90);
    }

    private static void decomposition(int n)
    {
        for (int i = 2; i < n + 1; i++)
        {
            while (n % i == 0 && n != i)
            {
                n /= i;
                System.out.print(i + "*");
            }
            if (n == i)
            {
                System.out.print(i);
                break;
            }

        }

    }
}
