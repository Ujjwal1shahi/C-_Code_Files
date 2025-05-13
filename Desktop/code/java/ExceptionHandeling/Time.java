import java.util.*;

class time {
     int hour, minute, second;

     void input() {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter hours: ");
          hour = sc.nextInt();
          System.out.print("Enter minutes: ");
          minute = sc.nextInt();
          System.out.print("Enter seconds: ");
          second = sc.nextInt();
     }

     public static void main(String[] args) {

          time t = new time();
          try {
               t.input();
   
               
               try {
                   if (t.hour > 24 || t.hour < 0) {
                       throw new HrsException();
                   }
               } catch (HrsException e) {
                   System.out.println("Exception occurred: " + e);
               }
   
          
               try {
                   if (t.minute >= 60 || t.minute < 0) {
                       throw new MinException();
                   }
               } catch (MinException e) {
                   System.out.println("Exception occurred: " + e);
               }
   
          
               try {
                   if (t.second >= 60 || t.second < 0) {
                       throw new SecException();
                   }
               } catch (SecException e) {
                   System.out.println("Exception occurred: " + e);
               }

               System.out.println("Time is: " + t.hour + " : " + t.minute + " : " + t.second);
               
           } catch (Exception e) {
               System.out.println("Exception occurred: " + e);
           }
       }
   
}

class HrsException extends Exception {
     String h;

     HrsException() {
          h = "hour must be less than 24";
     }

     public String toString() {
          return "InvalidHourException: " + h;
     }
}

class MinException extends Exception {
     String m;

     MinException() {
          m = "minute must be less than 60";
     }

     public String toString() {
          return "InvalidMinuteException: " + m;
     }
}

class SecException extends Exception {
     String s;

     SecException() {
          s = "second must be less than 60";
     }

     public String toString() {
          return "InvalidSecondException: " + s;
     }
}
