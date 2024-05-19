package Day8;

import java.util.Arrays;

public class MinnoPlatform {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {900, 940, 950, 1100, 500, 945};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

//        int arr[] = {500, 900, 940, 945, 950, 1100};
//        int dep[] = {910, 1120, 1130, 1200, 1900, 2000};
        System.out.println("Minimum number of platforms required is " + findPlatform(arr, dep, n));
    }



    public static int findPlatform(int[] arr, int[] dep, int n) {

        Arrays.sort(arr);
        Arrays.sort(dep);
        int maxPlatform = 1;
        int platformneeded = 1;
        int i=1, j = 0;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                platformneeded ++;
                i++;
            } else  {

                platformneeded--;
                j++;
            }
            maxPlatform = Math.max(maxPlatform, platformneeded);
        }
        return maxPlatform;
    }

}
