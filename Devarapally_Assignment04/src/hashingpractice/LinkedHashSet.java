package hashingpractice;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

public class LinkedHashSet {
	private HashTable hashTable;
	private Node head;

	public LinkedHashSet(int size) {
		this.hashTable = new HashTable(size);
		this.head = null;
	}

	public boolean add(int element) {
		if (contains(element)) {
			return false;
		}
		hashTable.add(element);
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		return true;
	}

	public boolean contains(int element) {
		return hashTable.search(element) != -1;
	}

	public void print() {
		System.out.print("LinkedHashSet Elements are: ");
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

}

