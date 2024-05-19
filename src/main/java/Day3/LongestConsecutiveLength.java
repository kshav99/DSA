package org.example.Day3;

import java.util.Arrays;

public class LongestConsecutiveLength {
    public static void main(String[] args) {
        int[] a = {100, 199,198,197,200,201,202, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
    public static int longestSuccessiveElements(int [] a)
    {   int longest = Integer.MIN_VALUE;
        int longestsofar = 1;
        int i =0;
        Arrays.sort(a);
        while(i<a.length-1)
        {
            if(a[i]+1 == a[i+1])
            {
               longestsofar++;
                longest=Math.max(longest, longestsofar);
            }
            else{

                longestsofar =1;
            }
            i++;

        }
        return longest;
    }
}