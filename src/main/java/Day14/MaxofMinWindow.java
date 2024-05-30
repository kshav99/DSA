package Day14;

import java.util.Arrays;
import java.util.Stack;

public class MaxofMinWindow {

    public static int[] findMaxOfMin(int[] arr) {
        int n = arr.length;
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        int[] result = new int[n + 1];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            leftMin[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();


        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            rightMin[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }


        for (int i = 0; i < n; i++) {
            int windowLen = rightMin[i] - leftMin[i] - 1;
            result[windowLen] = Math.max(result[windowLen], arr[i]);
        }


        for (int i = n - 1; i >= 1; i--) {
            result[i] = Math.max(result[i], result[i + 1]);
        }

        return Arrays.copyOfRange(result, 1, n + 1); // Exclude the first element
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 10, 70, 30};
        int[] result = findMaxOfMin(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
