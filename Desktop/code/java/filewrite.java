import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class demo{
     public static void main(String[] args) {
          FileInputStream src = null;
          FileOutputStream dest = null;

          try{
               src = new FileInputStream("file1.txt");
               dest = new FileOutputStream("file2.txt");

               int temp;
               while((temp = src.read()) != -1){
                    dest.write(temp);
               }

               if(src != null){
                    src.close();
               }
               if(dest != null){
                    dest.close();
               }
          }

          catch(IOException e){
               System.out.println(e);
          }
     }
}