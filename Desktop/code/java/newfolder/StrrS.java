import java.util.Scanner;

class InvalidPhoneNoException extends Exception {
    InvalidPhoneNoException() {
        super("Invalid Phone No");
    }
}

class InvalidEmailException extends Exception {
    InvalidEmailException() {
        super("Invalid Email");
    }
}

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];

        System.out.println("Enter the details of the students (Format: Name RollNo PhoneNo Email):");

        for (int i = 0; i < 10; i++) {
            try {
                String str = sc.nextLine();
                String[] s = str.split("\\s+");

                if (s[2].length() != 10) {
                    throw new InvalidPhoneNoException();
                }
                String expectedEmail = s[1] + "@kiit.ac.in";

                if (!s[3].equalsIgnoreCase(expectedEmail)) {
                    throw new InvalidEmailException();
                }

                arr[i] = str;

            } catch (InvalidPhoneNoException e) {
                System.out.println(e);
                return;
            } catch (InvalidEmailException e) {
                System.out.println(e);
                return;
            }
        }

        System.out.println("Entered Student Details:");
        for (int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
        }

        sc.close();
    }
}
