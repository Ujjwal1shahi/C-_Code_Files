import java.util.*;

class test{
     public static void main(String[] args) {
          One obj = new One(8,2);

          obj.subtract(89, 21);
          obj.subtract(88, 20, 2);
     }
}

class One {
     
     int m , n;
     One(int m, int n){
          this.m = m;
          this.n = n;

          System.out.println("Constructor one is called ");
     }

     void subtract(int x , int y){
          System.out.println("After Subtraction : "+(x-y));
     }

     void subtract(int x, int y, int z){
          System.out.println("After Subtraction : "+(x-y-z));
     }
}

