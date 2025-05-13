class Dynamic{
    public static void main(String[] args) {
       
        Apple ref;

        
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

       
        ref = apple;
        ref.show(); 

        ref = banana;
        ref.show(); 

        ref = cherry;
        ref.show(); 
    }
}


class Apple {
     void show() {
         System.out.println("This is the show method of class Apple");
     }
 }
 
 class Banana extends Apple {
   
    void show() {
         System.out.println("This is the show method of class Banana");
     }
 }
 
 class Cherry extends Apple {
     
     void show() {
         System.out.println("This is the show method of class Cherry");
     }
 }
 
