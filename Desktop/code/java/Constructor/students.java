import java.util.*;

class test{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the number of students : ");
          int n = sc.nextInt();

          students[] detail = new students[n];

          for(int i = 0; i < n; i++){

               System.out.println("Enter values : ");

               System.out.print("Roll No: ");
               int roll = sc.nextInt();
               sc.nextLine();
                  
               System.out.print("Name: ");
               String name = sc.nextLine();
   
               System.out.print("CGPA: ");
               double cgpa = sc.nextDouble();
               sc.nextLine();
   
               detail[i] = new students(roll, name, cgpa);
          }

          System.out.println("Displaying the student details: ");
          for(int i = 0; i < n ; i++){
               detail[i].display();
          }
     }
}

class students {
     
     int roll;
     String name;
     double cgpa;

     students(int roll, String name, double cgpa){
          this.roll = roll;
          this.name = name;
          this.cgpa = cgpa;
     }

     void display(){
          System.out.println("Name : "+ name + " " + "Roll : "+ roll + "CGPA : "+ cgpa);
     }
}
