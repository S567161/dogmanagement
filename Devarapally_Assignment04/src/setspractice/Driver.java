package setspractice;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        SetOperations setObject = new SetOperations();
        int ch;

        do {
        	System.out.println("\nMenu:\n1- Add an element\n2- Remove an element\n3- Stop");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    Object addElement = sc.next();
                    if (setObject.addToSet(addElement))
                        System.out.println("Element added successfully.");
                    else
                        System.out.println("Element already exists in the set.");
                    System.out.println(setObject);
                    break;
                case 2:
                    System.out.print("Enter the element to remove: ");
                    Object removeElement = sc.next();
                    if (setObject.removeFromSet(removeElement))
                        System.out.println("Element removed successfully.");
                    else
                        System.out.println("Element not found in the set.");
                    System.out.println(setObject);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        } while (ch != 3);

        sc.close();
    }

}
