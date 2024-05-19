package Day1;

import java.util.ArrayList;
import java.util.Arrays;

public class SortOnesTwos {
    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

    public static void sortArray(ArrayList<Integer> arr, int n)
    {
        int left = 0;
        int right = n-1;
        int mid = 0;
        while(mid<=right)
        {
            if(arr.get(mid)==0)
            {
                int temp = arr.get(mid);
                arr.set(mid,arr.get(left));
                arr.set(left,temp);
                mid++;
                left++;

            }
            else if(arr.get(mid)==1){mid++;}
            else{
                int temp = arr.get(mid);
                arr.set(mid,arr.get(right));
                arr.set(right,temp);
                right--;
            }
        }
    }
}
