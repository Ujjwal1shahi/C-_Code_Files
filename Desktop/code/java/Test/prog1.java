class test{
     public static void main(String[] args) {
          A target = new A();

          MyThread obj1 = new MyThread(target, "Hello");
          MyThread obj2 = new MyThread(target, "H");
          MyThread obj3 = new MyThread(target, "He");
          MyThread obj4 = new MyThread(target, "Hel");

          obj1.t.start();
          obj2.t.start();
          obj3.t.start();
          obj4.t.start();
     }
}

class A{
     void call(String s){
          System.out.println("["+s);

          try{
               Thread.sleep(100);
          }
          catch(InterruptedException e){
               System.out.println("Exception Occured");
          }

          System.out.println("]");
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