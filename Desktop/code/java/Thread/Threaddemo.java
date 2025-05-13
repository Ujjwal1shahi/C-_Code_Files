class test{
     public static void main(String[] args) {
          Mythread t1 = new Mythread();
          
          t1.t.start();

          try{
               for(int i = 1; i <= 5; i++){
                    System.out.println("Thread : "+i);
                    Thread.sleep(1000);
               }
          }
          catch(InterruptedException e){
               System.out.println("Thread : "+e);
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
                    System.out.println(i);
                    Thread.sleep(500);
               }
          }
          catch(InterruptedException e){
               System.out.println(e);
          }
	}
}
