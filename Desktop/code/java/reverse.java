class reverseLLusingSTK{
     public static void main(String[] args) {
          Linklist l = new Linklist();
          l.insert(21);
          l.insert(1);
          l.insert(6);
          l.insert(76);

          System.out.println("normal: ");
          l.display();

          System.out.println("reversed: ");
          l.reverse();
          l.display();
     }
}

class Node{
     int data;
     Node next;

     Node(int x){
          data = x;
          next = null;
     }
}


class Linklist{

     Node head = null;

     void insert(int x){
          Node newnode = new Node(x);
          if(head == null){
               head = newnode;
          }
          else{
               Node temp = head;
               while(temp.next != null){
                    temp = temp.next;
               }
               temp.next = newnode; 
          }
     }

     void display(){
          Node temp = head;
          while(temp != null){
               System.out.print(temp.data+" -> ");
               temp = temp.next;
          }
     }


     void reverse(){
          if(head == null){
               System.out.println("first create it.");
          }
          else{
               try{
               Stack s = new Stack(100);
               Node temp = head;
               while ( temp!= null) {
                    s.push(temp.data);
                    temp = temp.next;
               }

               temp = head;
               while(temp != null){
                    temp.data = s.pop();
                    temp = temp.next;
               }
          }
          catch(RuntimeException e){
               System.out.println("Exception has occured : ");
          }
               
          }
     }
}

class Stack{
     int stk[];
     int n;
     int top = -1;


     Stack(int size){
          n = size;
          stk = new int[n];
     }

     void push(int x){
          if(top == n-1){
               throw new RuntimeException("Stack Overflow");
          }
          else{
               stk[++top] = x;
          }
     }

     int pop(){
          if(top == -1){
               throw new RuntimeException("Stack underflow");
          }
          else{
               int val;
               val = stk[top--];
               return val;
          }
     }
}