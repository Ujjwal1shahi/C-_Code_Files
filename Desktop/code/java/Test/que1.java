import java.util.*;

class test{
     public static void countingValue(int lb , int ub){
          int counter;

          System.out.println("Counter variable is printing : ");
          for(int i = lb ; i <= ub ; i++){
               counter = i;
               System.out.println(counter);
               try {
                    Thread.sleep(100);
               } catch (InterruptedException e) {
                    System.out.println("Exception Occured");
               }
          }
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the Lower Bound : ");
          int lb = sc.nextInt();
          System.out.println("Enter the Upper Bound : ");
          int ub = sc.nextInt();

          Thread t1 = new Thread(() -> countingValue(lb,ub));
          t1.start();
     }
}