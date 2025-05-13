class test{
     public static void main(String[] args) {
          A target = new A();

          MyThread obj1 = new MyThread(target, "Java is a");
          MyThread obj2 = new MyThread(target, "programming language");

          obj1.t.start();
          obj2.t.start();
     }
}

class A{
     void call(String s){

          String []out = s.split(" ");

          for(int i = 0; i < out.length ; i++){
               System.out.println(Thread.currentThread().getName() + " " + out[i]);
          }
          try{
               Thread.sleep(100);
          }
          catch(InterruptedException e){
               System.out.println("Exception Occured");
          }
     }
}

class MyThread implements Runnable{

     Thread t;
     String msg;
     A a;

     MyThread(A target, String s){
          t = new Thread(this);
          msg = s;
          a = target;
     }

     public void run() {
          synchronized(a){
               a.call(msg);
          }         
     }
     
}