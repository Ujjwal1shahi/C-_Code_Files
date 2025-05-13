import java.util.*;
class student{
     @SuppressWarnings("resource")
     public static void main(String[] args) {

          Scanner NameStudent = new Scanner(System.in);
          System.out.println("Enter your name");
          String Name = NameStudent.nextLine();
          

          Scanner RollStudent = new Scanner(System.in);
          System.out.println("Enter your roll");
          String Roll = RollStudent.nextLine();
          

          Scanner SectionStudent = new Scanner(System.in);
          System.out.println("Enter your Section");
          String Section = SectionStudent.nextLine();
          

          Scanner BranchStudent = new Scanner(System.in);
          System.out.println("Enter your Branch");
          String Branch = BranchStudent.nextLine();
          

          System.out.println(Name);
          System.out.println(Roll);
          System.out.println(Section);
          System.out.println(Branch);


     }
}