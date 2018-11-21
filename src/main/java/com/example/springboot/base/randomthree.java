package com.example.springboot.base;

/**
 * @author Administrator
 */
public class randomthree
{
    public static void main(String[] args)
    {
        int amount=0;

        int count =0;
        for (int i = 1; i <5 ; i++)
        {
            for (int j = 1; j < 5 ; j++)
            {
                if (i==j){
                    continue;
                }
                for (int k = 1; k <5 ; k++)
                {
                    if (k!=j && i!=k){
                        amount=i*100+j*10+k;
                        System.out.println(amount+" ");
                        if ((++count)%5==0){
                            System.out.println();
                        }
                    }
                }

            }
        }
    }
}
