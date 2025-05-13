import java.util.*;

class evenodd {
     public static void main(String[] args) {

          int n = 10;
          int evenCount = 0, oddCount = 0;
          
          Scanner sc = new Scanner(System.in);

          int []arr = new int[n];

          for(int i = 0; i < n ; i++){
               System.out.println("Enter the number : ");
               arr[i] = sc.nextInt();
          }

          for(int i = 0 ; i < n; i++){
               if(arr[i] % 2 == 0){
                    evenCount++;
               }
               else{
                    oddCount++;
               }
          }


          System.out.println("NUmber of Even numbers are : "+ evenCount);
          System.out.println("Number of Odd numbers are : "+ oddCount);
     }     
}
