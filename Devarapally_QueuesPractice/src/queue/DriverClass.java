package queue;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/
import java.util.*;

public class DriverClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PRQueue queue = new LinkedListQueue(); 
      System.out.println("**Priority Queue implementation using LinkedList**");
      char select;
      do {
          System.out.println("1. Insert   2. Delete    3. Get Maximum     4. Size     5. Exit");
          System.out.print("Choose your option: ");
          int option = scan.nextInt();

          switch (option) {
              case 1:
                  System.out.print("Enter an integer value to insert: ");
                  int val = scan.nextInt();
                  queue.enqueue(val);
                  break;
              case 2:
                  int removedElement = queue.dequeue();
                  if (removedElement != -1)
                      System.out.println("Deleted element from queue: " + removedElement);
                  break;
              case 3:
                  int maxElement = queue.getMax();
                  if (maxElement != -1)
                      System.out.println("Maximum element in the queue: " + maxElement);
                  break;
              case 4:
                  System.out.println("Size of the queue: " + queue.size());
                  break;
              case 5:
                  System.out.print("Are you sure you want to exit(y/n): ");
                  select = scan.next().charAt(0);
                  if (select == 'y' || select == 'Y') {
                      System.out.println("Done!!!");
                      scan.close();
                      System.exit(0);
                  }
                  break;
              default:
                  System.out.println("Invalid option!");
          }
      } while (true);
  }
	

}
