import java.util.Scanner;

class test {

     void processInput() throws NegativeNumberException_2305505 {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int number = scanner.nextInt();

          if (number < 0) {
               throw new NegativeNumberException_2305505();
          } else {
               System.out.println("Double Value of the number: " + (number * 2));
          }
     }

     public static void main(String[] args) {
          test t = new test();
          try {
               t.processInput();
          } catch (NegativeNumberException_2305505 e) {
               System.out.println("Exception: " + e);
          }
     }
}

class NegativeNumberException_2305505 extends Exception {
     String m;

     NegativeNumberException_2305505() {
          m = "Negative Number is not allowed";
     }
     public String toString() {
     return "NegativeNumberException: " + m;
     }
}

