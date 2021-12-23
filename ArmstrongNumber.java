package com.mpstme;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int n, sum = 0, x, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        x = n;
        while (x > 0)
        {
            a = x % 10;
            sum = sum + (a*a*a);
            x = x/10;
        }
        if (sum == n)
        {
            System.out.println(n + " is an armstrong number");
        }
        else
        {
            System.out.println(n + " is not an armstrong number");
        }
    }
}
