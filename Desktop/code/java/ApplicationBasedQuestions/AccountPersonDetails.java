import java.util.Scanner;

class AccountDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[3];

        System.out.println("Enter details of three persons:");
        for (int i = 0; i < persons.length; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(sc);
        }

        System.out.println("\nDisplaying details of three persons:");
        for (int i = 0; i < persons.length; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            persons[i].disp();
        }

        sc.close();
    }
}

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter account number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter account balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    void input(Scanner sc) {
        super.input(sc);
        sc.nextLine(); // Consume the leftover newline
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = sc.nextLine();
    }

    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar number: " + aadhar_no);
    }
}
