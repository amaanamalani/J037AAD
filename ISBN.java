package assignment2;

import java.util.Scanner;

public class ISBN
{
    public static void main (String[] args)
    {
        long n;
        int sum = 0;
        int i, rem, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 digit number");
        n = sc.nextLong();
        String strn = "" + n;
        if (strn.length() == 10) {
            for (i = 1; i <= 10; i++) {
                x = (int) (n % 10);
                sum = sum + (x * i);
                n = n / 10;
            }
            rem = sum % 11;
            if (rem == 0)
            {
                System.out.println("ISBN Number");
            }
            else
            {
                System.out.println("Not ISBN Number");
            }
        }
        else
        {
            System.out.println("Not a 10 digit Number");
        }
    }
}

