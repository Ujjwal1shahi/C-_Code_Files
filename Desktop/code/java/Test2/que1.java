// copy into the file

import java.io.*;

class Copy_BS{
     public static void main(String[] args) {
          FileInputStream source = null;
          FileOutputStream dest = null;

          try{
               source = new FileInputStream("file1.txt");
               dest = new FileOutputStream("file2.txt");

               int temp;

               while((temp = source.read()) != -1){
                    dest.write(temp);
               }

               if(source != null){
                    source.close();
               }
               if(dest != null){
                    dest.close();
               }
          }
          catch(FileNotFoundException e){
               System.out.println("No file found");
          }
          catch(IOException e){
               System.out.println("IO Exception");
          }
     }
}