import java.util.*;

class ArithmeticExceptionHandling_2305505{
     public static void main(String[] args) {
          int d;
          int a;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numerator: ");
        a = sc.nextInt();

        System.out.println("Enter the denomenator: ");
        d = sc.nextInt();

        try {
            int x = a / d;
            System.out.println("Result: " + x);
        } catch (ArithmeticException e) {
            System.out.println("divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }
     }
}

