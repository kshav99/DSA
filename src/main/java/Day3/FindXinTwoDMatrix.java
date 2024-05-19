package org.example.Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class FindXinTwoDMatrix {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        boolean result = searchMatrix(matrix, 4);
        System.out.println(result ? "true" : "false");
    }
    public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target)
    {
        int col = matrix.get(0).size();
        int row = matrix.size();
        int low = 0;
        int high = (row * col ) - 1;
        while(low<=high)
        {
            int mid = (low + high)/ 2;
            int targetvalue = matrix.get(mid/col).get(mid%col);
            if(targetvalue == target)
            {
                return true;
            }
            else if(mid<target)
            {
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}
