import java.lang.*;

class B implements Runnable {
     Thread myt;
     String msg;

     A a;

     B(A tar, String s) {
          myt = new Thread(this);
          msg = s;
          a = tar;
     }

     public void run() {
          synchronized (a) {
               a.call(msg);
          }
     }
}

class A {
     // synchronized
     void call(String s) {

          System.out.println();
          try {
               Thread.sleep(1000);
          } catch (InterruptedException e) {
               System.out.println("Thread interrupted: " + e);
          }
          System.out.print("[" + s);
          try {
               Thread.sleep(1000);
          } catch (InterruptedException e) {
               System.out.println("Thread interrupted: " + e);
          }
          System.out.print("] ");

     }
}

class test {
     public static void main(String[] args) {
          A target = new A();
          B obj1 = new B(target, "Hello ");
          B obj2 = new B(target, "Sync ");
          B obj3 = new B(target, "World");

          obj1.myt.start();
          obj2.myt.start();
          obj3.myt.start();
     }
}