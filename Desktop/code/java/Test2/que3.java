// compare two files

import java.io.*;

class Compare{
     public static void main(String[] args) throws IOException {
          FileReader source1 = null;
          FileReader source2 = null;

          try{
               source1 = new FileReader("file1.txt");
               source2 = new FileReader("file2.txt");

               int temp = 0;
               int pos = 1;

               while((temp = source1.read()) != -1){
                    if(temp != source2.read()){
                         System.out.println(pos);
                         return;
                    }
                    pos++;
               }

               if((source2.read()) == -1){
                    System.out.println("The Files have Equal content");
                    return;
               }
               else{
                    System.out.println(pos);
                    return;
               }
          }
          finally{
               if(source1 != null){
                    source1.close();
               }
               if(source2 != null){
                    source2.close();
               }
          }
     }
}