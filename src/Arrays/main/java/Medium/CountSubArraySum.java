package Medium;

import java.util.ArrayList;

public class CountSubArraySum {

import java.util.*;


        public static int findAllSubarraysWithGivenSum(int arr[], int k) {
            int n = arr.length;
            int cnt = 0;
            int left = 0;
            int right = n-1;
            ArrayList<Integer> soln = new ArrayList<>();
            while(left<=right)
            {
                if(arr[left]+arr[right]==k)
                {
                    soln.add(arr[left]);
                    soln.add(arr[right]);
                    cnt++;
                }
                else if(arr[left]+arr[right]<k)

            }

         return 0;
        }

        public static void main(String[] args) {
            int[] arr = {3, 1, 2, 4};
            int k = 6;
            int cnt = findAllSubarraysWithGivenSum(arr, k);
            System.out.println("The number of subarrays is: " + cnt);
        }
    }



