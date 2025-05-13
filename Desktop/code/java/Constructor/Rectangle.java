import java.util.*;

class test{

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the value of length : ");
          double a = sc.nextDouble();

          System.out.println("Enter the value of breadth : ");
          double b = sc.nextDouble();

          Rectangle R = new Rectangle(a, b);

          R.read();
          R.calculate();
          R.display();
     }
}

class Rectangle {
     
     double length , breadth;

     double area, perimeter;

     Rectangle(double x, double y){
          length = x;
          breadth = y;
     }

     void read(){
          System.out.println("length : "+ length + " " +"brreadth : "+breadth);
     }

     void calculate(){
          area = length * breadth;

          perimeter = 2*(length + breadth);
     }

     void display(){
          
          System.out.println("Area : "+ area);
          System.out.println("Perimeter : "+ perimeter);
     }
}
