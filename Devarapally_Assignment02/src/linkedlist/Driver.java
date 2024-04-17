package linkedlist;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 names:");
        for (int i = 1; i <= 10; i++) {
        	System.out.print("Name " + i + " for " + (i % 2 == 0 ? "542" : "642") + ": ");
            String name = scanner.nextLine();
            namesList.add(name + "_" + (i % 2 == 0 ? "542" : "642"));
        }
        System.out.println("\nEntered names:");
        for (String name : namesList) {
            System.out.println(name);
        }
        ArrayList<String> arrListOne = new ArrayList<>();
        ArrayList<String> arrListTwo = new ArrayList<>();
        for (String name : namesList) {
            if (name.endsWith("_542")) {
                arrListOne.add(name);
            } else {
                arrListTwo.add(name);
            }
        }
        System.out.print("\nNames in course 542 : [");
        for (int i = 0; i < arrListOne.size(); i++) {
            String[] parts = arrListOne.get(i).split("_");
            System.out.print(parts[0]);
            if (i < arrListOne.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Names in course 642 : [");
        for (int i = 0; i < arrListTwo.size(); i++) {
            String[] parts = arrListTwo.get(i).split("_");
            System.out.print(parts[0]);
            if (i < arrListTwo.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        Random random = new Random();
        String removedFrom542 = arrListOne.remove(random.nextInt(arrListOne.size()));
        String removedFrom642 = arrListTwo.remove(random.nextInt(arrListTwo.size()));
        System.out.println("Names after randomly removing one element from each list.");
        System.out.print("Names in course 542 : [");
        for (int i = 0; i < arrListOne.size(); i++) {
            String[] parts = arrListOne.get(i).split("_");
            System.out.print(parts[0]);
            if (i < arrListOne.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Names in course 642 : [");
        for (int i = 0; i < arrListTwo.size(); i++) {
            String[] parts = arrListTwo.get(i).split("_");
            System.out.print(parts[0]);
            if (i < arrListTwo.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        LinkedList linkedListOne = new LinkedList();
        LinkedList linkedListTwo = new LinkedList();
        linkedListOne.setHead(createLinkedListNodes(arrListOne));
     linkedListTwo.setHead(createLinkedListNodes(arrListTwo));
        Node[] nodesArrListOne = createLinkedListNodes(arrListOne);
        Node[] nodesArrListTwo = createLinkedListNodes(arrListTwo);

        for (Node node : nodesArrListOne) {
            linkedListOne.mergedLinkedList(node);
        }
        for (Node node : nodesArrListTwo) {
            linkedListTwo.mergedLinkedList(node);
        }
        System.out.println("Linked List 1 elements:");
        linkedListOne.printLinkedList();

        System.out.println("Linked List 2 elements:");
        linkedListTwo.printLinkedList();
        
        System.out.println("Merged node elements:");
        linkedListOne.mergeLinkedList(linkedListTwo);
        linkedListOne.printLinkedList();

        System.out.println("After removing element at tail:");
        linkedListOne.removeTail();
        linkedListOne.printLinkedList();

        System.out.println("After adding elements at head and tail:");
        linkedListOne.addStart(new Node(removedFrom542));
        linkedListOne.addToTail(new Node(removedFrom642));
        linkedListOne.printLinkedList();

        // Close the scanner
        scanner.close();
    }

    private static Node[] createLinkedListNodes(ArrayList<String> arrayList) {
        Node[] nodes = new Node[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            nodes[i] = new Node(arrayList.get(i));
        }
        return nodes;
    }
        
}
