class test{
     public static void main(String[] args) {
          Mythread t1 = new Mythread();
          Mythread t2 = new Mythread();
          Mythread t3 = new Mythread();
          Mythread t4 = new Mythread();
          t1.t.start();
          t2.t.start();
          t3.t.start();
          t4.t.start();

          try{
               for(int i = 1; i <= 5; i++){
                    System.out.println("main class Thread : "+i);
                    Thread.sleep(1000);
               }
          }
          catch(InterruptedException e){
               System.out.println("main class Thread : "+e);
          }
     }
}

class Mythread implements Runnable{    
     
     Thread t;

     Mythread(){
          t = new Thread(this, "Mythread");
          System.out.println(t);
     }
	
	public void run() {
		try{
               for(int i = 5; i > 0 ; i-- ){
                    System.out.println("run class"+i);
                    Thread.sleep(1200);
               }
          }
          catch(InterruptedException e){
               System.out.println(e);
          }
	}
}
