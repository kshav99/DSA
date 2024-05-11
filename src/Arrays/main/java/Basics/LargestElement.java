package org.example.Basics;

public class LargestElement {

    public static int findLargest(int[] arr, int l)
    {
        int n = arr[0];
        for(int i = 0; i< l-1 ; i++)
        {
            if(n <arr[i])
            {
                n = arr[i];
            }

        }


        return n;
    }




    public static void main(String[] args) {
        int arr[] = {3,5,8,1,2,78,34};
        int l =  arr.length;
        int largest_Element  =  findLargest(arr, l);
        System.out.println("The largest element is " +largest_Element);


    }
}