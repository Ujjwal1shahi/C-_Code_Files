class test{
     public static void main(String[] args) {
          Mythread t1 = new Mythread("First");
          Mythread t2 = new Mythread("Second");
          Mythread t3 = new Mythread("Third");
          t1.t.start();
          t2.t.start();
          t3.t.start();
     }
}

class Mythread implements Runnable{    
     
     Thread t;

     Mythread(String s){
          t = new Thread(this, s);
          System.out.println(t);
     }
	
	public void run() {
		try{
               for(int i = 100; i >= 90 ; i-- ){
                    System.out.println(t.getName()+" Thread "+i);
                    Thread.sleep(100);
               }
          }
          catch(InterruptedException e){
               System.out.println(e);
          }
	}
}
