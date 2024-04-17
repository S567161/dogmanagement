package queue;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

public class QueuesUsingLinkedList {
 private Node head; 
 private Node tail; 

 public QueuesUsingLinkedList() {
     this.head = null;
     this.tail = null;
 }

 public void enqueue(int x) {
     Node newNode = new Node(x);
     if (isEmpty()) {
         head = newNode;
         tail = newNode;
     } else {
         tail.next = newNode;
         tail = newNode;
     }
 }

 public int dequeue() {
     if (isEmpty()) {
         System.out.println("Queue is empty");
         return -1; 
     }
     int removedData = head.data;
     head = head.next;
     if (head == null) {
         tail = null; 
     }
     return removedData;
 }
 public boolean isEmpty() {
     return head == null;
 }
 public int size() {
     int count = 0;
     Node current = head;
     while (current != null) {
         count++;
         current = current.next;
     }
     return count;
 }

 public void print() {
     Node current = head;
     System.out.print("Elements in queue: [");
     while (current != null) {
         System.out.print(current.data);
         if (current.next != null) {
             System.out.print(", ");
         }
         current = current.next;
     }
     System.out.println("]");
 }
}
