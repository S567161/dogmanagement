package queue;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

import java.util.Scanner;

public class QueueDriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueuesUsingLinkedList queueObject = new QueuesUsingLinkedList();

        char ch = 0;
        do {
            System.out.println("Queue using Linked List Operations");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Size");
            System.out.println("5. Check Empty or not");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter an element to insert: ");
                    int element = sc.nextInt();
                    queueObject.enqueue(element);
                    System.out.println(element + " is inserted into the queue");
                    break;
                case 2:
                    int dequeue = queueObject.dequeue();
                    if (dequeue != -1) {
                        System.out.println(dequeue + " is removed from queue");
                    }
                    break;
                case 3:
                    queueObject.print();
                    break;
                case 4:
                    System.out.println("Size of the queue = " + queueObject.size());
                    break;
                case 5:
                    if (queueObject.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    }
                    break;
                case 6:
                    System.out.print("Do you want to exit(y/n): ");
                    ch = sc.next().charAt(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 'y');
        System.out.println("Operations on queue are done.");
    }
}

