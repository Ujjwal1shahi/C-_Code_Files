import java.util.*;

class test{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the length of plate : ");
          double pl = sc.nextDouble();

          System.out.println("Enter the breadth of plate : ");
          double pb = sc.nextDouble();

          plate p = new plate(pl, pb);
          p.showPlate();

          System.out.println("Enter the length of box : ");
          double bl = sc.nextDouble();

          System.out.println("Enter the breadth of box : ");
          double bb = sc.nextDouble();

          System.out.println("Enter the height of box : ");
          double bh = sc.nextDouble();

          box b = new box(bl, bb, bh);
          b.showBox();

          System.out.println("Enter the length of wood box : ");
          double wbl = sc.nextDouble();

          System.out.println("Enter the breadth of wood box : ");
          double wbb = sc.nextDouble();

          System.out.println("Enter the height of wood box : ");
          double wbh = sc.nextDouble();

          System.out.println("Enter the thickness of wood box : ");
          double wbt = sc.nextDouble();

          wood_box wb = new wood_box(wbl, wbb,wbh ,wbt);
          wb.showWood_box();
     }
}

class plate{
     double length, width;

     plate(double l, double w){

          length = l;
          width = w;

          System.out.println("Plate class!");
     }

     void showPlate(){
          System.out.println("Dimensions are : "+length+" "+width);
     }
}

class box extends plate{
     double height;

     box(double l, double w, double h){
          super(l,w);
          height = h;
          System.out.println("Box class!");
     }

     void showBox(){
          System.out.println("Dimensions are : "+length+" "+width+" "+height);
     }
}

class wood_box extends box{

     double thick;

     wood_box(double l, double w, double h, double t){
          super(l,w,h);
          thick = t;
     }

     void showWood_box(){
          System.out.println("Dimensions are : "+length+" "+width+" "+height+" "+thick);
     }
}