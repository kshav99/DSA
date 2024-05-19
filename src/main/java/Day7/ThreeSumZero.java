package org.example.Day7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumZero {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(arr, n);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    public static List<List<Integer>> triplet(int [] arr, int l)
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i<l;i++)
        {
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            int j = i+1;
            int k = l-1;

            while(j<k)
            {
                int sum = arr[i]+arr[k]+arr[j];
                if(sum<0)
                {
                    j ++;
                }
                else if(sum>0){k--;}
                else{
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                k--;
                j++;
                }
            }
        }
    return ans;

    }
}
