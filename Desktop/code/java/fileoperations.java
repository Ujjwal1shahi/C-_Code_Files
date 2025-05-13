import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


class Prac{
     // public static void main(String[] args) {
     //      FileInputStream src = null;
     //      FileInputStream dest = null;

     //      try{
     //           src = new FileInputStream("file11.txt");
     //           dest = new FileInputStream("File11out.txt");

     //           int temp;
     //           int pos = 0;

     //           while((temp = src.read()) != -1){
     //                if(temp != dest.read()){
     //                     System.out.println("Failed"+ " " +pos);
     //                     break;
     //                }
     //                pos++;
     //           }

     //           if(dest.read() == -1){
     //                System.out.println("Success");
     //           }
     //           else{
     //                System.out.println("Failed"+ " " +pos);
     //           }

     //           if(src != null){
     //                src.close();
     //           }
     //           if(dest != null){
     //                dest.close();
     //           }
     //      }
     //      catch(IOException e){
     //           System.out.println(e);
     //      }
     // }

     // public static void main(String[] args) {
     //      FileInputStream src = null;
     //      FileOutputStream dest = null;

     //      try{
     //           src = new FileInputStream("file11.txt");
     //           dest = new FileOutputStream("File11out.txt");

     //           int temp;
     //           while((temp = src.read()) != -1){
     //                dest.write(temp);
     //           }

     //           System.out.println("Success");

     //           if(src != null){
     //                src.close();
     //           }
     //           if(dest != null){
     //                dest.close();
     //           }
     //      }
     //      catch(IOException e){
     //           System.out.println(e);
     //      }
     // }

     public static void main(String[] args) {
          FileInputStream src = null;

          try{
               src = new FileInputStream("file11.txt");

               String str = "";
               int temp;
               while((temp = src.read()) != -1){
                    str = str + (char)temp;
               }

               if(src != null){
                    src.close();
               }

               System.out.print(str);

               for(int i = 0; i < str.length(); i++){
                    System.out.print(str.charAt(i) + " " + i+ " ");
               }
          }
          catch(IOException e){
               System.out.println(e);
          }
     }
     // public static void main(String[] args) {
     //      FileOutputStream src = null;

     //      try{
     //           src = new FileOutputStream("file11.txt", true);

     //           String str = "iwuehkffzse hefuhfhekfh hehah iewuhds haks ddkja dwidlazjs kdsjk";
     //           byte[] b = str.getBytes();
     //           src.write(b);
     //      }
     //      catch(IOException e){
     //           System.out.println(e);
     //      }
     // }
}