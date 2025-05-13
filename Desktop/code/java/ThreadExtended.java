import java.lang.Thread;

class test{
     public static void main(String[] args) {
          My_th t = new My_th();
          My_th z = new My_th("User Thread 2");

          t.start();
          z.start();
     }
}

class My_th extends Thread{
     My_th(){
          super("User Thread 1");
          System.out.println("Thread is (c1) : "+" "+this);
     }
     My_th(String s){
          super(s);
          System.out.println("Thread is (c2) : "+" "+this);
     }

     public void run(){
          try{
               for(int i = 0; i<10 ; i++){
                    System.out.println(" Thread " + Thread.currentThread().getName() + " : "+i );
                    Thread.sleep(3000);
               }
          }
          catch(InterruptedException e){
                    System.out.println("Interupt has occured");
          }
     }
     
}