import java.util.*;

class Node {
     int data;
     Node next;

     Node(int data) {
          this.data = data;
          this.next = null;
     }
}

class LinkedList {
     Node head;

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

     public void printList() {
          Node temp = head;
          while (temp != null) {
               System.out.print(temp.data + " ");
               temp = temp.next;
          }
          System.out.println();
     }

     public void reverseUsingStack() {
          Stack stack = new ();
          Node temp = head;
          while (temp != null) {
               stack.push(temp);
               temp = temp.next;
          }
          if (!stack.isEmpty()) {
               head = stack.pop();
               temp = head;
          }
          while (!stack.isEmpty()) {
               temp.next = stack.pop();
               temp = temp.next;
          }
          temp.next = null;
     }
}

public class StackExample {
     public static void main(String[] args) {
          LinkedList list = new LinkedList();
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);

          System.out.println("Original LinkedList:");
          list.printList();

          list.reverseUsingStack();

          System.out.println("Reversed LinkedList:");
          list.printList();
     }
}