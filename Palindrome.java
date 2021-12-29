package assignment2;

import java.util.Scanner;

public class Palindrome
{
    public static void main (String[] args)
    {
        int n, x, y, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        x = n;
        while (x>0)
        {
            y = x % 10;
            sum = (sum*10) + y;
            x = x / 10;
        }
        if (sum == n)
        {
            System.out.println(n+" is a palindrome number");
        }
        else
        {
            System.out.println(n+" is not a palindrome number");
        }
    }
}
