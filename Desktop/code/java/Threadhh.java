import java.lang.Thread;
class test_thread{
     public static void main(String[] args) {
          Thread t = Thread.currentThread();

          String s1 = t.getName();
          System.out.println("Name of Thread is : "+s1);

          System.out.println("Current Thread : "+t);

          t.setName("ABCCBA");
          System.out.println("After giving new name to thread : "+t);

          System.out.println(t.getPriority());

          t.setPriority(1);
          System.out.println(t);


          try{
               for(int i = 0; i < 10; i++){
                    System.out.println("Thread" + " " + t.getName() +" : " + i);
                    Thread.sleep(5000);
               }
          }catch(InterruptedException e){
               System.out.println("Interrupt has occured here");
          }
     }
}