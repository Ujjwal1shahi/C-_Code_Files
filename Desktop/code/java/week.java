import java.util.*;

class week {
     @SuppressWarnings("resource")
     public static void main(String[] args) {
          Scanner WDay = new Scanner(System.in);
          System.out.println("Enter the day :");
          int num = WDay.nextInt();


          switch(num){
               case 0:
               System.out.println("Monday");
               break;

               case 1:
               System.out.println("Tuesday");
               break;

               case 2:
               System.out.println("Wednesday");
               break;

               case 3:
               System.out.println("THrusday");
               break;

               case 4:
               System.out.println("Friday");
               break;

               case 5:
               System.out.println("Saturday");
               break;

               case 6:
               System.out.println("Sunday");
               break;

               default:
               System.out.println("Not a valid input");
               break;
          }
     }
}
