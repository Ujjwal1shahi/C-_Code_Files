class Node {
     int data;
     Node next;
 
     Node(int data) {
         this.data = data;
         this.next = null;
     }
 }

 class Stack {
     private Node top;
 
     public Stack() {
         this.top = null;
     }
 
     // Push operation
     public void push(int data) {
         Node newNode = new Node(data);
         newNode.next = top;
         top = newNode;
     }
 
     // Pop operation
     public int pop() {
         if (isEmpty()) {
             throw new RuntimeException("Stack Underflow");
         }
         int value = top.data;
         top = top.next;
         return value;
     }
 
     // Check if stack is empty
     public boolean isEmpty() {
         return top == null;
     }
 }
 
 // LinkedList class
 class LinkedList {
     private Node head;
 
     // Add element to the linked list
     public void add(int data) {
         Node newNode = new Node(data);
         if (head == null) {
             head = newNode;
         } else {
             Node temp = head;
             while (temp.next != null) {
                 temp = temp.next;
             }
             temp.next = newNode;
         }
     }
 
     // Print the linked list
     public void printList() {
         Node temp = head;
         while (temp != null) {
             System.out.print(temp.data + " -> ");
             temp = temp.next;
         }
         System.out.println("NULL");
     }
 
     // Reverse linked list using stack
     public void reverseUsingStack() {
         Stack stack = new Stack();
         Node temp = head;
 
         // Push all elements onto stack
         while (temp != null) {
             stack.push(temp.data);
             temp = temp.next;
         }
 
         // Pop elements and reconstruct list
         temp = head;
         while (temp != null) {
             temp.data = stack.pop();
             temp = temp.next;
         }
     }
 }
 
 // Main class
 public class ReverseLinkedListUsingStack {
     public static void main(String[] args) {
         LinkedList list = new LinkedList();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
 
         System.out.println("Original Linked List:");
         list.printList();
 
         list.reverseUsingStack();
 
         System.out.println("Reversed Linked List:");
         list.printList();
     }
 }
 