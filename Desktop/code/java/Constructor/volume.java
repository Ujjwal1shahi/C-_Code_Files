import java.util.*;

class Demo{
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the length: ");
          double x = sc.nextDouble();

          System.out.println("Enter the width: ");
          double y = sc.nextDouble();

          System.out.println("Enter the height: ");
          double z = sc.nextDouble();

          Box b = new Box(x, y, z);
          b.volume();
     }
}

class Box{
     double length, width, height;

     Box(double length, double width, double height){
          this.length = length;
          this.width = width;
          this.height = height;
     }

     void volume(){
          double volume = length * width * height; 
          System.out.println("Volume is :"+volume);
     }
}