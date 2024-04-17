package mapspractice;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

public class Node {
    private long key;
    private Person person;
    private Node next;
    private Node prev;
    private Node after;
    private Node before;

    // Parameterized constructor
    public Node(long key, Person person) {
        this.key = key;
        this.person = person;
    }

    // Getter and setter methods for all instance variables

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getAfter() {
        return after;
    }

    public void setAfter(Node after) {
        this.after = after;
    }

    public Node getBefore() {
        return before;
    }

    public void setBefore(Node before) {
        this.before = before;
    }
}

