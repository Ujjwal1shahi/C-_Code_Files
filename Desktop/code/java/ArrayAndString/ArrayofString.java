import java.util.*;
import java.lang.String;

class ArrayOfString{
     public static void main(String[] args) {
          String[] s = {"a","c","e","d"};

          for(int i = 0; i<=s.length-1 ; i++){
               for(int j = i+1; j<=s.length-1 ; j++){
                    if((s[i].compareTo(s[j])) > 0){
                         String t = s[i];
                         s[i] = s[j];
                         s[j] = t;
                    }
               }
          }

          for(int i = 0; i<=s.length-1; i++){
          System.out.println(s[i]+" ");
          }
     }
}