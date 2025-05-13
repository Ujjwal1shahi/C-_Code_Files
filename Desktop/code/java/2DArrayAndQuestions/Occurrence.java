import java.util.*;

class occurence {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the size of the array :");
          int n = sc.nextInt();

          int[] numbers = new int[n];

          for (int i = 0; i < n; i++) {
               System.out.println("Enter the numbers : ");
               numbers[i] = sc.nextInt();
          }

          int[] countednum = new int[n];

          for (int i = 0; i < n; i++) {
               countednum[i] = 0;
          }

          for (int i = 0; i < n; i++) {
               if (countednum[i] == 0) {
                    int count = 1;
                    for (int j = i + 1; j < n; j++) {
                         if (numbers[i] == numbers[j]) {
                              count++;
                              countednum[j] = 1;
                         }
                    }
                    System.out.println("Occurence of number " + numbers[i] + " = " + count);
               }
          }

     }
}
