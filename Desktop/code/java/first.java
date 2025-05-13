cdimport java.util.*;

@SuppressWarnings("unused")
public class first {
     public static void main(String args[]) {

          int n = 5;
          int m = 5;

          // solid rectangle
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= m; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }

          // hollow ractangle
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= m; j++) {
                    if (i == 1 || i == n || j == 1 || j == m) {
                         System.out.print("*");
                    } else {
                         System.out.print(" ");
                    }
               }
               System.out.println();
          }

          // half pyramid
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= i; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }

          // half inverted pyramid
          for (int i = 1; i <= n; i++) {
               for (int j = i; j <= n; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }

          // or we can write like this
          for (int i = n; i >= 1; i--) {
               for (int j = 1; j <= i; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }

          // inverted half pyramid 180 degree
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
               }
               for (int j = 1; j <= i; j++) {
                    System.out.print("*");
               }

               System.out.println();
          }

          // half pyramid with numbers
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
               }
               System.out.println();
          }

          // inverted half pyramid with numbers
          for (int i = n; i >= 1; i--) {
               for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
               }
               System.out.println();
          }

          // or we can write like this
          for (int i = 1; i <= n; i++) {
               for (int j = i; j <= n; j++) {
                    System.out.print(j + " ");
               }
               System.out.println();
          }

          // or we can write like this
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print(j + " ");
               }
               System.out.println();
          }

          // Floyd's Triangle
          int number = 1;
          for (int i = 0; i <= n; i++) {
               for (int j = 0; j <= i; j++) {
                    System.out.print(number + " ");
                    number++;
               }
               System.out.println();
          }

          // 0-1 Triangle
          for (int i = 0; i <= n; i++) {
               for (int j = 0; j <= i; j++) {

                    int sum = i + j;

                    if (sum % 2 == 0) {
                         System.out.print("1" + " ");
                    } else {
                         System.out.print("0" + " ");
                    }
               }
               System.out.println();
          }

          // BUtterfly Pattern
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= i; j++) {
                    System.out.print("*");
               }

               int spaces = 2 * (n - i);
               for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
               }

               for (int j = 1; j <= i; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }
          for (int i = n; i >= 1; i--) {
               for (int j = 1; j <= i; j++) {
                    System.out.print("*");
               }

               int spaces = 2 * (n - i);
               for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
               }

               for (int j = 1; j <= i; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }

          // Solid Rombus for n = 4
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
               }

               for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
               }

               System.out.println();
          }

          // Number Pyramid
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
               }

               for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
               }

               System.out.println();
          }

          // Palindrome Pattern
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
               }

               for (int j = i; j >= 1; j--) {
                    System.out.print(j);
               }
               for (int j = 2; j <= i; j++) {
                    System.out.print(j);
               }

               System.out.println();
          }

          // Daimond Pattern
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
               }

               for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }

          for (int i = n; i >= 1; i--) {
               for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
               }

               for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }

          // Pattern
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n - i; j++) { // j=i
                    System.out.print(" ");
               }

               for (int j = i; j <= 2 * i - 1; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }

          for (int i = n; i >= 1; i--) {
               for (int j = 1; j <= n - i; j++) { // j=i
                    System.out.print(" ");
               }

               for (int j = i; j <= 2 * i - 1; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }
     }
}
