package org.example.Day3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraywithnonRepeating {
    public static void main(String args[]) {
        String str = "abcabcdbb";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));
    }
    public static int solve(String str)
    {
        Map<Character,Integer> map = new HashMap<>();
        int l = str.length();
        int i = 0;
        int longestsofar = 0;
        int max = Integer.MIN_VALUE;
        while(i<l) {
            if (map.containsKey(str.charAt(i))) {
                map = new HashMap<>();
                map.put(str.charAt(i), 1);
                longestsofar = 1;
            } else {
                map.put(str.charAt(i), 1);
                longestsofar++;
                max = Math.max(longestsofar, max);
            }
                i++;
        }

        return max;
    }
}
