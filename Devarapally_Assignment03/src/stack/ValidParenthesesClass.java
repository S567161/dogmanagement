package stack;

/**
*
* @author S567161 Udaykiranreddy Devarapally
*/
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesesClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String userInput = sc.nextLine();

        if (!isValid(userInput)) {
            System.out.println("Input String must contain numbers, alphabets, and mathematical operators.");
            return;
        }

        Stack<Character> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        Stack<Character> braces = new Stack<>();

        for (char c : userInput.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                operands.push(c);
            } else if (isOp(c)) {
                operators.push(c);
            } else if (isBraces(c)) {
                braces.push(c);
            }
        }

        System.out.println("Operands Stack:" + operands);
        System.out.println("Operators Stack:" + operators);
        System.out.println("Braces Stack:" + braces);

        if (checkBraces(braces)) {
            System.out.println("The braces are closed correctly.");
        } else {
            System.out.println("The braces aren't closed correctly.");
        }
    }

    private static boolean isValid(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !isOp(c) && !isBraces(c) && !Character.isWhitespace(c)) {
                return false; 
            }
        }
        return true;
    }



    private static boolean isOp(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '%';
    }

    private static boolean isBraces(char c) {
        return c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}';
    }

    private static boolean checkBraces(Stack<Character> braces) {
        Stack<Character> t = new Stack<>();
        for (char c : braces) {
            if (c == '(' || c == '[' || c == '{') {
                t.push(c);
            } else {
                if (t.isEmpty() || !isMatch(t.pop(), c)) {
                    return false;
                }
            }
        }
        return t.isEmpty();
    }

    private static boolean isMatch(char char1, char char2) {
        return (char1 == '(' && char2 == ')') ||
               (char1 == '[' && char2 == ']') ||
               (char1 == '{' && char2 == '}');
    }
}


