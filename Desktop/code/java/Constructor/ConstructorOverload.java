
import java.util.*;
class Rectangle {
     private double length;
     private double breadth;
 
  
Rectangle() {
         this.length = 0;
         this.breadth = 0;
     }
 

 Rectangle(double length, double breadth) {
         this.length = length;
         this.breadth = breadth;
     }

 void displayArea() {
         System.out.println("Area of Rectangle: " + (length * breadth));
     }
 }
 
 public class ConstructorOverload {
     public static void main(String[] args) {
      
         Rectangle defaultRectangle = new Rectangle();
         System.out.println("Using default constructor:");
         defaultRectangle.displayArea();
 
       
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter length: ");
         double length = sc.nextDouble();
         System.out.print("Enter breadth: ");
         double breadth = sc.nextDouble();
 
         Rectangle paramRectangle = new Rectangle(length, breadth);
         System.out.println("Using parameterized constructor:");
         paramRectangle.displayArea();
 
      
     }
 }
 