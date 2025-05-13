import java.util.*;

class main{
     public static void main(String[] args) {
          int count = 0;
          try
          {
              for(int i=0; i<=3; i++)
              {
               if(Integer.parseInt(args[i]) != 0){
                    count++;
               }
              }

              if(count < 4){
               throw new CheckArgument();
              }
              else{
               int sumOfSquares = 0;
               for(int i = 0; i < count; i++){
                    
                        int num = Integer.parseInt(args[i]);
                        sumOfSquares = sumOfSquares + (num * num);
                    
               }
               System.out.println("Sum of squares: " + sumOfSquares);
              }

          }
          catch(CheckArgument e){
               System.out.println("You have not enterd all 4 values");
          }
     
     }
}

class CheckArgument extends Exception{

     String m;
     CheckArgument(){
          m = "CheckArgumentException";
     }

     public String toString(){
          return "CheckArgumentException:"+m;
     }
}




 