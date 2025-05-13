import java.util.*;

class test{
     public static void main(String[] args) {
          kittian k = new kittian();
          k.getInput();
          k.course();
     }
}


abstract class student{
     int roll;
     int reg_no;

     void getInput(){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your roll number : ");
          roll = sc.nextInt();

          System.out.println("Enter your reg_no. : ");
          reg_no = sc.nextInt();

     }

     abstract void course();
}

class kittian extends student{

     void course() {
          System.out.println("Enter the course name : ");
          Scanner sc = new Scanner(System.in);
          String course = sc.nextLine();
          System.out.println("Roll number : "+roll);
          System.out.println("Reg_Number : "+reg_no);
          System.out.println("Course provided : "+course);
     }
}