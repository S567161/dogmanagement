package array;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Create two arrays of type integer
        int[] arr1 = new int[10];  // Assuming size is 10
        int[] arr2 = new int[10];  // Assuming size is 10

        // Filling both arrays with random values between 15-25
        fillArrayWithRandomValues(arr1, 15, 25);
        fillArrayWithRandomValues(arr2, 15, 25);

        // Displaying the filled arrays
        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
        System.out.println("Array 2: " + java.util.Arrays.toString(arr2));

        // Create a variable named "sum" of type integer.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sum: ");
        int sum = scanner.nextInt();

        // Call the method to find pairs with the given sum
        findPairsWithSum(arr1, arr2, sum);
    }

    // Method to fill an array with random values between min and max (inclusive)
    private static void fillArrayWithRandomValues(int[] arr, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }
    }

    private static void findPairsWithSum(int[] arr1, int[] arr2, int sum) {
        int pairCount = 0;
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 + num2 == sum) {
                    pairCount++;
                    System.out.println("Pair " + pairCount + ": (" + num1 + ", " + num2 + ")");
                }
            }
        }
        if (pairCount == 0) {
            System.out.println("No pair Found");
        }
    }
}

