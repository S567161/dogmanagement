package stack;

/**
*
* @author S567161 Udaykiranreddy Devarapally
*/
import java.util.*;

public class SwapStackElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + capacity + " numbers:");
        Stack<Integer> intStack = new Stack<>();
        for (int i = 0; i < capacity; i++) {
            int element = sc.nextInt();
            intStack.push(element);
        }

        System.out.println("Stack Elements: " + intStack);

        System.out.print("Enter the first index to swap: ");
        int firstIndex = sc.nextInt();
        System.out.print("Enter the second index to swap: ");
        int secondIndex = sc.nextInt();

        if (isValid(firstIndex, intStack.size()) && isValid(secondIndex, intStack.size())) {
            swapStackElements(intStack, firstIndex, secondIndex);
            System.out.println("After swapping the stack: " + intStack);
        } else {
            System.out.println("Invalid indices.");
        }
    }
    private static boolean isValid(int index, int size) {
        return index >= 0 && index < size;
    }
    private static void swapStackElements(Stack<Integer> stack, int firstIndex, int secondIndex) {
        int first = stack.get(firstIndex);
        int second = stack.get(secondIndex);
        stack.set(firstIndex, second);
        stack.set(secondIndex, first);
    }
}

