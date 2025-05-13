import java.io.*;

class countFromFile{
     public static void main(String[] args) {
          int charCount = 0, whiteSpace = 0, word = 0, sentence = 0;

          try{
               FileReader file1 = new FileReader("file11.txt");
               BufferedReader b = new BufferedReader(file1);

               String temp;
               while((temp = b.readLine()) != null){
                    word = word + temp.split("\\s+").length;
                    whiteSpace = word - 1;
                    charCount = charCount + temp.length();
                    sentence = sentence + temp.split("[.!?]+\\s*").length;
               }

               if(file1 != null){
                    file1.close();
               }

               System.out.println("wordCount = " + word +"\n"+ "White Space = "+ whiteSpace + "\n"+ "char Count = "+ charCount + "\n"+ "sentences = "+ sentence);
          }
          catch(IOException e){
               System.out.println(e);
          }
     }
}