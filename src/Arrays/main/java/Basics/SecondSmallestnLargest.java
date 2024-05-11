package org.example.Basics;

public class SecondSmallestnLargest {
    public static void main(String[] args)
    {
        int []  arr  = {2,5,6,12,56,32,78,79,54,89,41};
        int  l = arr.length;
        int ss = secondSmallest(arr,l);
        int sl = secondlargest(arr,l);
        System.out.print("2nd largest is "
        +sl +" and " + "2nd smallest is " + ss);

    }
    public static int secondSmallest(int[] arr, int l)
    {
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;
        for(int  i = 0 ; i < l ; i++)
        {
            if(arr[i] < small){
                secondsmall = small;
                small = arr[i];
            }
            else if( arr[i] < secondsmall && arr[i]!=small)
            {
                secondsmall = arr[i];
            }
        } return secondsmall;
    }
    public static int secondlargest(int[] arr, int l){
        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        for(int  i = 0 ; i < l; i++)
        {
            if(arr[i] > large){
                secondlarge = large;
                large = arr[i];
            }
            else if( arr[i] > secondlarge && arr[i]!=large)
            {
                secondlarge = arr[i];
            }
        } return secondlarge;

    }

}

