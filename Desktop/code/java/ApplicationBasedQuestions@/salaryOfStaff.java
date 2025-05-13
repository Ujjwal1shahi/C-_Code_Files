import java.util.*;

class test{
     public static void main(String[] args) {
          Substaff s = new Substaff();
          s.Earning();
          s.Deduction();
          s.Bonus();
     }
}

interface Salary_Structure{
     void Earning();
     void Deduction();
     void Bonus();
}

abstract class Manager implements Salary_Structure{
     double basic,DA,HRA;
     
     public void Earning() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter basic salary: ");
     basic = sc.nextDouble();
     DA = 0.8 * basic;
     HRA = 0.15 * basic;
     double earnings = basic + DA + HRA;
     System.out.println("Earnings: " + earnings);
     }

     
     public void Deduction() {
         double deduction = 0.12*basic;
         System.out.println("Deduction: " + deduction);
     }

}

class Substaff extends Manager{

     public void Bonus(){
          double bonus = 0.5*basic;
          System.out.println("Bonus: " + bonus);
     }
}