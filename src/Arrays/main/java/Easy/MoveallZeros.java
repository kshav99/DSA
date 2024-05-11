package Easy;

import java.util.Arrays;

public class MoveallZeros {
    public static void main(String [] args)
    {
        int arr[] = {0,4,5,8,0,0,1,0,0,1,0};
        int l = arr.length;
        System.out.println(Arrays.toString(movezeros(arr, l)));
    }

    public static int[] movezeros(int[] arr, int l) {
        int left = 0;
        for (int i = 0; i < l; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with the leftmost non-zero element
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }
        return arr;
    }
}