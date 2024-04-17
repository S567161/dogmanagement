package mapspractice;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the map: ");
        int size = sc.nextInt();
        LinkedHashMap<Long, Person> lHashMap = new LinkedHashMap<>();
        
        System.out.println("Enter inputs of ssn, name, age, and gender :\n");
        
        while (true) {
            System.out.print("Social Security Number: ");
            long ssn = sc.nextLong();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            lHashMap.put(ssn, new Person(name, age, gender));
            
            System.out.print("Do you want to enter another record? (yes/no): ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
        
        System.out.println("\nLinkedHashMap:");
        System.out.println("{");
        for (Map.Entry<Long, Person> entry : lHashMap.entrySet()) {
            System.out.println(entry.getKey() + "=[name=" + entry.getValue().getName() + ", age=" + entry.getValue().getAge() + ", gender=" + entry.getValue().getGender() + "],");
        }
        System.out.println("}");

        int option;
        do {
            System.out.println("\n1. Find a person by Social Security Number");
            System.out.println("2. Remove a person by Social Security Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter Social Security Number to find: ");
                    long ssn = sc.nextLong();
                    Person person = lHashMap.get(ssn);
                    if (person != null) {
                        System.out.println(ssn + "=[name=" + person.getName() + ", age=" + person.getAge() + ", gender=" + person.getGender() + "]");
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Social Security Number to remove: ");
                    long ssnToRemove = sc.nextLong();
                    if (lHashMap.containsKey(ssnToRemove)) {
                        lHashMap.remove(ssnToRemove);
                        System.out.println("LinkedHashMap after removal:");
                        System.out.println("{");
                        for (Map.Entry<Long, Person> entry : lHashMap.entrySet()) {
                            System.out.println(entry.getKey() + "=[name=" + entry.getValue().getName() + ", age=" + entry.getValue().getAge() + ", gender=" + entry.getValue().getGender() + "],");
                        }
                        System.out.println("}");
                    } else {
                        System.out.println("Person with given Social Security Number not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please enter again.");
            }
        } while (option != 3);

        sc.close();
    }
}


