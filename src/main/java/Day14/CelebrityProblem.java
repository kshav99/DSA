package Day14;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 1, 0}
        };

        int celebrity = findCelebrity(matrix);

        if (celebrity != -1) {
            System.out.println("Celebrity: " + celebrity);
        } else {
            System.out.println("No celebrity found");
        }
    }

    public static boolean knows(int[][] matrix, int a, int b) {
        return matrix[a][b] == 1;
    }
    public static int findCelebrity(int[][] matrix) {

        int n = matrix.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
            while (stack.size() > 1) {
                int a = stack.pop();
                int b = stack.pop();
                if (matrix[a][b] == 1) {
                    stack.push(b);
                } else {
                    stack.push(a);
                }
            }
        int x = stack.pop();


        for (int i = 0; i < matrix.length; i++) //noinspection SuspiciousIndentAfterControlStatement
        {
           if (i == x) continue;

            if (matrix[x][i] == 1) {  // Check celebrity knows no one first
                return -1;
            }
            if (matrix[i][x] == 0) {  // Check everyone knows only if the first condition is false
                return -1;
            }
        }


        return x;
    }
    }

