package hashingpractice;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

import java.util.*;
public class LinkedSetDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements (enter -1 to stop):");
		int ch;
		do {
			System.out.print("Enter element: ");
			ch = sc.nextInt();
			if (ch != -1) {
				arrayList.add(ch);
			}
		} while (ch != -1);
		LinkedHashSet set = new LinkedHashSet(arrayList.size());
		for (int element : arrayList) {
			set.add(element);
		}
		set.print();
		do {
		    System.out.print("Enter element to search (-1 to stop): ");
		    ch = sc.nextInt();
		    if (ch != -1) {
		        boolean elementIsPresent = set.contains(ch);
		        if (elementIsPresent) {
		            System.out.println("Element found in the LinkedHashSet.");
		        } else {
		            System.out.println("Element not found.");
		        }
		    }
		} while (ch != -1);
		System.out.println("Operation finished");
	}

}

