package assignment2;

public class PrintArray
{
    public static void main (String[] args)
    {
        int a[] = {1,2,3,4,5,6,7,8,9,0};
        int i;
        System.out.println("Elements of the array are :");
        for (i=0 ; i<a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
