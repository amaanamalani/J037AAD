package assignment2;

public class CopyArray
{
    public static void main(String[] args)
    {
        int a1[] = {1,2,3,4,5};
        int a2[] = new int[a1.length];
        int i;
        for (i=0 ; i<5 ; i++)
        {
            a2[i] = a1[i];
        }
        System.out.println("Elements on main array :");
        for (i=0 ; i<5 ; i++)
        {
            System.out.println(a1[i]);
        }
        System.out.println("Elements of new array :");
        for (i=0 ; i<5 ; i++)
        {
            System.out.println(a2[i]);
        }
    }
}
