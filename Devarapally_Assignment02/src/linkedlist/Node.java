package linkedlist; 
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

public class Node {
    String name;
    Node next;

    // Parameterized constructor
    public Node(String name) {
        this.name = name;
        this.next = null;
    }
 // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for next
    public Node getNext() {
        return next;
    }

    // Setter for next
    public void setNext(Node next) {
        this.next = next;
    }
	
    
}

