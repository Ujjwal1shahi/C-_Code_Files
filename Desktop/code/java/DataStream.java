import java.io.*;

class dataStream{
     public static void main(String[] args) {
          FileOutputStream f1 = null;
          DataOutputStream dout = null;

          try{
               f1 = new FileOutputStream("file11.txt");
               dout = new DataOutputStream(f1);

               int[] buff = {21,32,4,54,56,65};
               for(int b : buff){
                    dout.write(b);
               }

               if(f1 != null) {
                    f1.close();
               }
          }
          catch(IOException e){
               System.out.println(e);
          }

          FileInputStream f2 = null;
          DataInputStream din = null;

          try{
               f2 = new FileInputStream("file11.txt");
               din = new DataInputStream(f2);

               while(din.available() > 0){
                    System.out.println(din.readInt());
               }

               if(f2 != null){
                    f2.close();
               }
          }
          catch(IOException e){
               System.out.println(e);
          }
     }
}