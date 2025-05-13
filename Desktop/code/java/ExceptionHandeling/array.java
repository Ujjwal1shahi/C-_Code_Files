import java.util.*;

class testArray_2305505{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int[] a = new int[4];

        try
        {
            for(int i=0; i<=5; i++)
            {
                a[i] = sc.nextInt();
            }
        }

        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException:" + e);
        } 

    }
}
