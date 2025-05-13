import java.util.Scanner;

class Shape {
    
    public void area(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

   
    public void area(double base, double height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }


    
    public void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
}

public class OverloadArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Choose shape (circle, triangle, square): ");
        String choice = sc.next().toLowerCase();

        switch (choice) {
            case "circle":
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                shape.area(radius);
                break;

            case "triangle":
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                shape.area(base, height);
                break;

            case "square":
                System.out.print("Enter side: ");
                int side = sc.nextInt();
                shape.area(side);
                break;

            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
