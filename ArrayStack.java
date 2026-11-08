package stack;
import java.util.Stack;

public class ArrayStack {

    public static int[] reverseArray(int[] numbers) {
        Stack<Integer> stack = new Stack<>();

        // Push numbers
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        // Create array
        int[] result = new int[numbers.length];

        // Pop into array
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static int[] reversefirstk(int[] numbers, int k) {
        Stack<Integer> stack = new Stack<>();

        // Push
        for (int i = 0; i < k; i++) {
            stack.push(numbers[i]);
        }

        int[] result = new int[numbers.length];

        // Pop
        for (int i = 0; i < k; i++) {
            result[i] = stack.pop();
        }
        
        for (int i = k; i < numbers.length; i++) {
            result[i] = numbers[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int[] result = reverseArray(numbers);

        System.out.println("Reverse whole array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        int k = 3;
        int[] result2 = reversefirstk(numbers, k);

        System.out.println("\nReverse first K elements:");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
    }
}