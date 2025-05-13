import java.util.*;

class matrix {
     public static void main(String[] args) {
          int Leftsum = 0 ,Rightsum = 0 ;
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the size of matrix : ");
          int n = sc.nextInt();


          int [][]matrix = new int[n][n];

          System.out.println("Enter the element of the matrix : ");

          for(int i = 0 ; i < n; i++){
               for(int j = 0; j < n ; j++){
                    matrix[i][j] = sc.nextInt();
               }
          }

          for(int i = 0 ; i < n ; i++){
               for(int j = 0 ; j <= i ; j++){
                    if(i == j){
                         Leftsum = Leftsum + matrix[i][j];
                    }
               }    
          }

          for(int i = 0 ; i < n ; i++){
               for(int j = 0 ; j <= i ; j++){
                    if(i+j == n-1){
                         Rightsum = Rightsum + matrix[i][j];
                    }
               }
          }


          System.out.println("Sum of Left Diagonal element is : "+Leftsum);
          System.out.println("Sum of Right Diagonal element is : "+Rightsum);
     }     
}


