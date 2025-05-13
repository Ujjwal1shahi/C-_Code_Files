class threadtest{
     public static void main(String[] args) {
          Thread t = Thread.currentThread();

          String S1 = t.getName();
          System.out.println(S1);

          System.out.println("Current Thread : "+t);

          t.setName("Myname");
          System.out.println("After changing the name of current thread : "+t);

          String S2 = t.getName();
          System.out.println(S2);

          t.setPriority(9);
          System.out.println(t);

          try{
               for(int i = 0; i < 10 ; i++){
                    System.out.println("Thread : "+i);
                    Thread.sleep(100);
               }
          }
          catch(InterruptedException e){
               System.out.println(e);
          }
          
     }
}