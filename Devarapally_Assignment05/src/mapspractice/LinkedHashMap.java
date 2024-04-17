package mapspractice;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

public class LinkedHashMap {
    private Node[] hashTable;
    private Node head;
    private Node curr;

    // Parameterized constructor
    public LinkedHashMap(int capacity) {
        hashTable = new Node[capacity];
    }

    public void put(long key, Person person) {
        int i = (int) (key % hashTable.length);
        Node newNode = new Node(key, person);
        
        if (hashTable[i] == null) {
            hashTable[i] = newNode;
        } else {
            Node current = hashTable[i];
            while (current.getNext() != null && current.getKey() != key) {
                current = current.getNext();
            }
            if (current.getKey() == key) {
                current.getPerson().setName(person.getName());
                current.getPerson().setAge(person.getAge());
                current.getPerson().setGender(person.getGender());
            } else {
                current.setNext(newNode);
                newNode.setPrev(current);
            }
        }
    }

    public Node get(long key) {
        int i = (int) (key % hashTable.length);
        Node current = hashTable[i];
        while (current != null) {
            if (current.getKey() == key) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean remove(long key) {
        int i = (int) (key % hashTable.length);
        Node current = hashTable[i];
        while (current != null) {
            if (current.getKey() == key) {
                if (current.getPrev() != null) {
                    current.getPrev().setNext(current.getNext());
                } else {
                    hashTable[i] = current.getNext();
                }
                if (current.getNext() != null) {
                    current.getNext().setPrev(current.getPrev());
                }
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LinkedHashMap:\n{ ");
        for (Node node : hashTable) {
            while (node != null) {
                sb.append(node.getKey()).append("=[")
                        .append("name=").append(node.getPerson().getName()).append(", ")
                        .append("age=").append(node.getPerson().getAge()).append(", ")
                        .append("gender=").append(node.getPerson().getGender()).append("], ");
                node = node.getNext();
            }
        }
        if (sb.length() > 10) { 
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" }");
        return sb.toString();
    }
}

