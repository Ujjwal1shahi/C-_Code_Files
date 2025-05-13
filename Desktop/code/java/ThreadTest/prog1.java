class test{
     public static void main(String[] args) {
          MyThread t1 = new MyThread();
          MyThread t2 = new MyThread("Two");
          t1.start();
          t2.start();
     }
}

class MyThread extends Thread {
     MyThread() {
          super("Demo Thread");
          System.out.println("The Thread is "+ this);
     }

     MyThread(String s){
          super(s);
          System.out.println("The Thread is "+ this);
     }

     public void run() {
          try{
               for(int i = 10; i > 0 ; i--){
                    System.out.println(i);
                    Thread.sleep(500);
               }
          }
          catch(InterruptedException e){
               System.out.println(e);
          }
     }

}