import java.io.*;

class demo{
     public static void main(String[] args)throws IOException {
          FileReader src = null;
          // FileWriter dest = null;
          FileReader src2 = null;

          // try{
          //      src = new FileReader("file11.txt");
          //      dest = new FileWriter("file11out.txt", true);

          //      int temp;
          //      // String s = "qwerty is a keyboard";
          //      // dest.write(s);

          //      while((temp = src.read()) != -1){
          //           dest.write((char)temp);
          //      }
          //      dest.flush();
          // }
          // finally{
          //      if(src != null){
          //           src.close();
          //      }
          //      if(dest != null){
          //           dest.close();
          //      }
          // }

          // compare
          try{
               src = new FileReader("file11.txt");
               src2 = new FileReader("file11out.txt");

               int temp;
               int pos = 0;
               while((temp = src.read()) != -1){
                    if(temp != src2.read()){
                         System.out.println("Failed " + " : " + pos);
                    }
               }

               if(src2.read() == -1){
                    System.out.println("Success : " + pos);
               }
               else{
                    System.out.println("Failed " + " : " + pos);
               }
          }
          catch(IOException e){
               System.out.println(e);
          }

     }
}