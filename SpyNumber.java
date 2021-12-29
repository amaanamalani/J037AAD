package assignment2;

import java.util.Scanner;

public class SpyNumber
{
    public static void main(String[] args)
    {
        int n, x, sum = 0, p = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        while (n>0)
        {
            x = n % 10;
            sum = sum + x;
            p = p * x;
            n = n / 10;
        }
        if (sum == p)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not a Spy Number");
        }
    }
}
