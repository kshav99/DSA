package org.example.Basics;

import java.util.Arrays;

public class RotatebyOne {
    public static  void  main(String[] args){
        int [] arr  = {2,6,7,1,23,45};
        int l =  arr.length;
        int [] rotatedarray = rotatebyone(arr,l);
        System.out.print("Rotated array is " + Arrays.toString(rotatedarray));
    }

    public static int[] rotatebyone(int[] arr, int l){
        int temp = arr[0];
        for(int i=0;i<l-1;i++)
        {
            arr[i] = arr[i+1];
        } arr[l - 1] = temp;

    return arr;
}}
