package queue;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

public class LinkedListQueue extends PRQueue{
	
	Node head;
	
	public LinkedListQueue() {
		head=null;
	}

	@Override
	public void enqueue(int x) {
		Node newNode = new Node(x);
		if (head == null) {
	        head = newNode; 
	    } else if (x < head.data) {
	        newNode.next = head; 
	        head = newNode;
	    } else {
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode; 
	    }
    Print();
		
		
	}

	@Override
	public int dequeue() {
		if (head == null) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int removedElement = head.data;
        head = head.next;
        return removedElement;
	}

	@Override
	public int getMax() {
		
		if (head == null) {
            throw new IllegalStateException("Queue is empty");
        }
        Node current = head;
        int max = current.getData();
        while (current != null) {
            if (current.getData() > max) {
                max = current.getData();
            }
            current = current.getNext();
        }
        return max;
	}

	@Override
	public int size() {
		int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
	}
	
	public void Print() {
        Node temp = head;
        System.out.print("Elements in Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
