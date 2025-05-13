import java.util.Scanner;

class test{
     public static void main(String[] args) {
          head h = new head();
          
          h.getDetails();
          h.getDptDetails();
          h.show();
     }
}

interface Employee{
     void getDetails();
}

interface Manager extends Employee{
     void getDptDetails();
}

class head implements Manager{

     String Emp_name;
     int Emp_id;

     String DeptName;
     int Dept_id;

     public void getDetails() {

          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter the Emp_id : ");
          Emp_id = sc.nextInt();
          sc.nextLine();

          System.out.println("Enter the Employee Name : ");
          Emp_name = sc.nextLine();
     }

     public void getDptDetails() {

          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter the Dept_id : ");
          Dept_id = sc.nextInt();
          sc.nextLine();

          System.out.println("Enter the Department Name : ");
          DeptName = sc.nextLine();
     }

     void show(){
          
          System.out.println("Employee id: "+Emp_id);
          System.out.println("Employee Name: "+Emp_name);
          System.out.println("Department id: "+Dept_id);
          System.out.println("Employee Name: "+DeptName);
     }
}