class test{
     public static void main(String[] args) {
          washing_machine wm = new washing_machine();

          wm.run();
          wm.consume();
          washing_machine.show();
     }
}

interface motor{
     String capacity = "High" ;
     
     void run();
     void consume();
}

class washing_machine implements motor{
    
     public void run() {
         
         System.out.println("Washing machine is running");
     }

     
     public void consume() {
         
         System.out.println("Washing machine is consuming power");
     }

     static void show(){
          System.out.println("Capacity of the motor is : "+capacity);
     }


}