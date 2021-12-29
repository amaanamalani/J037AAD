package assignment2;

public class DuplicateArray
{
    public static void main(String[] args)
    {
        int a[] = {1,2,2,3,4,5,6,7,7,8,0,0};
        int i, j;
        System.out.println("Duplicate Elements in the array are :");
        for (i=0 ; i<a.length ; i++)
        {
            for (j=i+1 ; j<a.length ; j++)
            {
                if (a[i] == a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
