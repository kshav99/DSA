package org.example.Day3;

import java.util.Arrays;

public class ConsecutiveSubarraywithSumZero {
    public static void main(String args[])
    {
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(solve(a));
    }
    public static int solve(int [] a)
    {   int longest = Integer.MIN_VALUE;
        int longestsofar = 1;
        int i =1;
        int sum = a[0];
        while(i<a.length-1)
        {
            sum += a[i];
            longestsofar++;
            if(sum == 0)
            {
                longest=Math.max(longest, longestsofar);
                longestsofar =1;
                sum = a[i++];
            }
            else {
                i++;
            }
        }
        return longest;
    }
}
