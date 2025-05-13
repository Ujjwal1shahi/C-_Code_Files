import java.util.*;
import java.lang.String;

class StringOperation {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the String : ");
          String s = sc.nextLine();

          // String s1 = s.toUpperCase();
          // String s2 = s.toLowerCase();
          // System.out.println("Upper case of : " +s+" is : "+s1);
          // System.out.println("Lower case of : " +s+" is : "+s2);

          // String s3 = "";
          // for (int i = s.length() - 1; i >= 0; i--) {
          //      char a = s.charAt(i);
          //      s3 = s3 + a;
          // }
          // System.out.println("Reversed string is : "+s3);
          
          // System.out.println("Enter the 2nd string: ");
          // String s11 = sc.nextLine();
          // int s4 = s.compareTo(s11);
          // System.out.println("Compared ASCII values are : "+s4);

          // System.out.println("Enter the 2nd String : ");
          // String s5 = sc.nextLine();
          // String s6 = s.concat(" "+s5);
          // System.out.println("After concatenating the string : "+s6);

          // System.out.println("Enter the character : ");
          // char s7 = sc.next().charAt(0);
          // int i = s.indexOf(s7);
          // System.out.println("Character present at : "+i);

          // if(s.equals(s3)){
          // System.out.println("It is a palindrome");
          // }
          // else{
          // System.out.println("Not a palindrome");
          // }

          int wordCount = 0;
          int vowelCount = 0;
          int consonantCount = 0;
          String s9 = "AEIOUaeiou";

          String[] words = s.split("\\s+");
          wordCount = words.length;

          for (int j = 0; j<s.length(); j++) {
               char c = s.charAt(j);
               if (s9.indexOf(c) != -1) {
                    vowelCount++;
               } else if (Character.isLetter(c)) {
                    consonantCount++;
               }
          }

          

          System.out.println("Number of words: " + wordCount);
          System.out.println("Number of vowels: " + vowelCount);
          System.out.println("Number of consonants: " + consonantCount);

     }
}