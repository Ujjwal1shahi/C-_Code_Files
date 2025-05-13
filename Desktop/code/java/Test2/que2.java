
// copy content into the file
import java.io.*;

class Copy_CS{
     public static void main(String[] args) throws IOException {
          FileReader source = null;
          FileWriter dest = null;

          try{
               source = new FileReader("file1.txt");
               dest = new FileWriter("file3.txt");

               int temp;
               String str = " ";

               while((temp = source.read()) != -1){
                    str = str + (char)temp;
               }
               dest.write(str);
               dest.flush();
          }
          finally{
               if(source != null){
                    source.close();
               }
               if(dest != null){
                    dest.close();
               }
          }
     }
}