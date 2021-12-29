package assignment2;

public class Fibonacci
{
    public static void main (String[] args)
    {
        int a1 = 0, a2 = 1, a3, n = 10, i;
        System.out.print(a1+ " " +a2);
        for (i=2; i<n; i++)
        {
            a3 = a1 + a2;
            System.out.print(" "+a3);
            a1=a2;
            a2=a3;
        }
    }
}
