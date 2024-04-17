package setspractice;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/


import java.util.ArrayList;

public class SetOperations {
    private int size;
    private ArrayList<Object> list;

    // Default constructor
    public SetOperations() {
        this.size = 0;
        this.list = new ArrayList<>();
    }

    private void setSize() {
        this.size = list.size();
    }

    // Method to add element to set
    public boolean addToSet(Object element) {
        if (!list.contains(element)) {
            list.add(element);
            setSize();
            return true;
        }
        return false;
    }

    // Method to remove element from set
    public boolean removeFromSet(Object element) {
        if (list.contains(element)) {
            list.remove(element);
            setSize();
            return true;
        }
        return false;
    }

    // Method to display size and elements of the set
    @Override
    public String toString() {
        return "Set: Size: " + size + ", Elements: " + list.toString();
    }
}
