package hashingpractice;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/


import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter elements (enter -1 to stop):");
        int element;
        do {
            System.out.print("Enter element: ");
            element = sc.nextInt();
            if (element != -1) {
                arrayList.add(element);
            }
        } while (element != -1);

        HashTable hashTable = new HashTable(arrayList.size());

        for (int num : arrayList) {
            hashTable.add(num);
        }

        hashTable.print();
        int ele;
        do {
            System.out.print("Enter element to search (-1 to stop): ");
            ele = sc.nextInt();
            if (ele != -1) {
                int result = hashTable.search(ele);
                if (result != -1) {
                    System.out.println("Element found at index " + result);
                } else {
                    System.out.println("Element not found.");
                }
            }
        } while (ele != -1);

        sc.close();
    }
}

