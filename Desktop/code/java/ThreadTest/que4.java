class que4{
     public static void even(){
          int evenno;
          for(int i = 1; i <= 50 ; i++){
               if(i % 2 == 0){
                    evenno = i;
                    System.out.println("Even no. : " + Thread.currentThread() + " " + i);
               }
          }
     }

     public static void odd(){
          int oddno;
          for(int i = 1; i <= 50 ; i++){
               if(i % 2 != 0){
                    oddno = i;
                    System.out.println("Odd no. : "+ Thread.currentThread() + " " +i);
               }
          }
     } 

     public static void main(String[] args) {
          Thread t1 = new Thread(() -> even());
          Thread t2 = new Thread(() -> odd());
          t1.setName("EvenThread");
          t2.setName("OddThread");

          t1.start();
          try{
               t1.join();
          }catch(InterruptedException e){
               System.out.println(e);
          }
          
          t2.start();
     }
}