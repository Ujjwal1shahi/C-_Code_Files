import java.io.*;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class buff{
     public static void main(String []args){
          // try{
          //      BufferedInputStream buffi = new BufferedInputStream(new FileInputStream("file11.txt"));
          //      BufferedOutputStream dest = new BufferedOutputStream(new FileOutputStream("file11out.txt", true));

          //      int temp;
          //      byte[] buffer = new byte[1024];
          //      while((temp = buffi.read(buffer)) != -1){
          //           dest.write(buffer,0,temp);
          //      }

          //      if(buffi != null){
          //           buffi.close();
          //      }
          //      if(dest != null){
          //           dest.close();
          //      }
          // }
          // catch(IOException e){
          //      System.out.println(e);
          // }

          try{
               BufferedReader src = new BufferedReader(new FileReader("file11.txt"));
               BufferedWriter dest = new BufferedWriter(new FileWriter("file11out.txt", true));

               int temp;
               while((temp = src.read()) != -1){
                    dest.write((char)temp);
               }
               dest.flush();

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