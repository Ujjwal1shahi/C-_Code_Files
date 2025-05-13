import java.util.*;

class palindrom {
     @SuppressWarnings("resource")
     public static void main(String[] args) {
          Scanner num = new Scanner(System.in);
          System.out.println("Enter the number : ");
          int value = num.nextInt();

          // while (num != 0) {
          //      remainder = num % 10;
          //      reversedNum = reversedNum * 10 + remainder;
          //      num /= 10;
          //    }

          int remainder;
          int reversed = 0;

          while(value != 0){
               remainder = value % 10;
               reversed = reversed * 10 + remainder;
               value = value / 10;
          }

          if(reversed == value){
               System.out.println("Your given number was a palindrome");
          }
          else{
               System.out.println("Your given number was not a palindrome");
          }
     }
}
