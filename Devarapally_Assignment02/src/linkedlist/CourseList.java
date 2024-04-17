package linkedlist;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

import java.util.ArrayList;
import java.util.Random;

public class CourseList {
    private ArrayList<ArrayList<String>> courses;
    public CourseList() {
        courses = new ArrayList<>();
        courses.add(new ArrayList<>()); // Course 1
        courses.add(new ArrayList<>()); // Course 2
    }

    public void addCourseList(ArrayList<String> list) {
        if (list.size() >= 2) {
            courses.get(0).addAll(list.subList(0, list.size() / 2)); 
            courses.get(1).addAll(list.subList(list.size() / 2, list.size())); 
        }
    }

    public String[] removeNames() {
        String[] removedNames = new String[2];

        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            ArrayList<String> courseSection = courses.get(i);
            if (!courseSection.isEmpty()) {
                int randomIndex = random.nextInt(courseSection.size());
                removedNames[i] = courseSection.remove(randomIndex);
            }
        }

        return removedNames;
    }
    public void printNames() {
        System.out.println("Course 1: " + courses.get(0));
        System.out.println("Course 2: " + courses.get(1));
    }
    public Node[] getLinkedLists() {
        Node[] linkedLists = new Node[2];

        for (int i = 0; i < 2; i++) {
            linkedLists[i] = createLinkedList(courses.get(i));
        }

        return linkedLists;
    }

    private Node createLinkedList(ArrayList<String> courseSection) {
        Node head = null;
        Node current = null;

        for (String name : courseSection) {
            Node newNode = new Node(name);
            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }

        return head;
    }
   
}
