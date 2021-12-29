package assignment2;

import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        int n, x, r = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        while (n>0)
        {
            x = n % 10;
            r = (r * 10) + x;
            n = n / 10;
        }
        System.out.println("Reverse Number "+r);
    }
}
