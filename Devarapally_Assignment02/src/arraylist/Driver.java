package arraylist;

/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

import java.util.ArrayList;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        
        ArrayList<Integer> numberList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 15; i++) {
            int randomNumber = r.nextInt(51) + 100; // Generates random integer between 100 and 150
            numberList.add(randomNumber);
        }
        System.out.println("Initial Random Numbers in ArrayList: " +numberList);
        System.out.println("Size of ArrayList " +numberList.size());
        
        //Filling arrayIndex with random numbers from 1 to 50
        ArrayList<Integer> arrayIndex = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int ranIndex = r.nextInt(50) + 1; // Generates random number from 1 to 50
            arrayIndex.add(ranIndex);
        }
        for (int i = 0; i < 15; i++) {
            int index = arrayIndex.get(i) - 1;
            if (index < 0 || index >= numberList.size()) {
                index = r.nextInt(numberList.size());
            }
            numberList.set(index, r.nextInt(50) + 1);
        }
        System.out.println("\nUpdated Random Numbers in ArrayList: " +numberList);
        System.out.println("Size of ArrayList " +numberList.size());

        // Remove 7 random numbers from random indices in updated numberList
        for (int i = 0; i < 7; i++) {
            int indexToRemove = r.nextInt(numberList.size());
            numberList.remove(indexToRemove);
        }
        System.out.println("\nArrayList after removing 7 numbers: " +numberList);
        System.out.println("Size of ArrayList " +numberList.size());

        // Generate random integers between 150 and 200
        for (int i = 0; i < 7; i++) {
            numberList.add(r.nextInt(51) + 150); // Generates random integer between 150 and 200
        }

        // Displaying  the final numberList
        
        System.out.println("\nArrayList after adding numbers: " +numberList);
        System.out.println("Size of ArrayList " +numberList.size());
    }
}

