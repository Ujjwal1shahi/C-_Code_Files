import java.util.*;

class sort {
     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the number of the elements : ");
          int n = sc.nextInt();
          int []numbers = new int[n];

          System.out.println("Enter the numbers : ");
          for(int i = 0 ; i < n ; i++){
               System.out.println("Enter the number : ");
               numbers[i] = sc.nextInt();
          }

          for(int i = 0; i < n-1 ; i++){
               for(int j = 0; j < n-i-1 ; j++){
                    if(numbers[j] > numbers[j + 1] ){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    }
               }
          }


          System.out.println("Numbers in ascending order are : ");
          for(int i = 0 ; i < n ; i++){
               System.out.println(numbers[i]+" ");
          }


     }     
}
