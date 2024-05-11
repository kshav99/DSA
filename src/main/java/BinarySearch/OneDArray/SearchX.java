package BinarySearch.OneDArray;

import java.util.Scanner;

public class SearchX {

    public static void main(String[] args) {
        int arr[] = {2, 56, 78, 90, 110};
        int l = arr.length;
        System.out.println("Enter the number to find");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = findX(arr, l, x);
        if (ans != -1) {
            System.out.println("The element is present at index " + ans);
        }
    }

    public static int findX(int[] arr, int l, int x) {
        int low = arr[0];
        int high = arr[l - 1];


        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x)
            {
                return mid;
            }


            else if (mid > x) {
                high = mid - 1;
            } else {
                low = mid+1;
            }


        }return -1;
    }}