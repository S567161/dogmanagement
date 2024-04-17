package linkedlist;

/**
*
* @author S567161 Udaykiranreddy Devarapally
*/



public class LinkedList {
    private Node head;
    public LinkedList() {
        this.head = null;
    }
    public void mergeLinkedList(LinkedList otherList) {
        if (head == null) {
            head = otherList.getHead();
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(otherList.getHead());
        }
    }
    public void mergedLinkedList(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void addStart(Node newNode) {
        newNode.setNext(head);
        head = newNode;
    }
    public void addToTail(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            String[] parts = current.getName().split("_");
            System.out.print(parts[0]);

            if (current.getNext() != null) {
                System.out.print(" ");
            }

            current = current.getNext();
        }
        System.out.println();
    }
    public void removeTail() {
        if (head == null || head.getNext() == null) {
            head = null;
        } else {
            Node current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
        }
    }

	public Node getHead() {
		
		return null;
	}

	public void setHead(Node[] newHead) {
        if (newHead != null && newHead.length > 0) {
            this.head = newHead[0];

            Node current = this.head;
            for (int i = 1; i < newHead.length; i++) {
                current.setNext(newHead[i]);
                current = current.getNext();
            }
        }
	}
}


