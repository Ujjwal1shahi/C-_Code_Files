import java.util.*;

class test{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the length of two dimensional sheet : ");
          double l = sc.nextDouble();

          System.out.println("Enter the breadth of two dimwnsional sheet : ");
          double b = sc.nextDouble();

          twoD sheet = new twoD(l, b);
          sheet.showPrice2D();

          System.out.println("Enter the length of 3D box : ");
          double leng = sc.nextDouble();
          System.out.println("Enter the breadth of 3D box : ");
          double bread = sc.nextDouble();
          System.out.println("Enter the height of 3D box : ");
          double heigh = sc.nextDouble();

          threeD box = new threeD(leng, bread, heigh);
          box.showPrice3D();
     }
}

class twoD{

     double length, breadth;
     double area;

     twoD(double l, double b){
          length = l;
          breadth = b;
     }

     void showPrice2D(){
          area = length*breadth;
          System.out.println("Cost of 2D sheet as per your dimension is : " + area*40);
     }
}

class threeD extends twoD{

     double height;
     double volume;

     threeD(double l, double b, double h) {
          super(l, b);
          height = h;
          volume = l*b*h;
     }

     void showPrice3D(){
          System.out.println("Cost of 3D sheet as per your dimension is : "+ volume*60);
     }
}

