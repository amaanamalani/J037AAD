package com.mpstme;

import java.util.Scanner;

public class NeonNumber
{
    public static void main(String[] args)
    {
        int n;
        int sum = 0;
        int sq;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        sq = n*n;
        while (sq !=0)
        {
            x = sq % 10;
            sum = sum + x;
            sq = sq / 10;
        }
        if (n == sum)
        {
            System.out.println("It is a Neon Number");
        }
        else
        {
            System.out.println("It is not a Neon Number");
        }

    }

}
