package Day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import  java.util.*;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] mergeOverlappingIntervals)
    {
        List<List<Integer>> ans = new ArrayList<>();
Arrays.sort(mergeOverlappingIntervals, new Comparator<int[]>() {
    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[0]-o2[0];
    }
});

        int currentansindex = -1 ;
        for(int i = 0; i < mergeOverlappingIntervals.length ;i++)
        {
            if(ans.size() != 0 && ans.get(currentansindex).get(1) >= mergeOverlappingIntervals[i][0] && ans.get(currentansindex).get(1) <=mergeOverlappingIntervals[i][1])
            {
            ans.get(currentansindex).set(1,mergeOverlappingIntervals[i][1]);
            }
            else{
                ans.add(Arrays.asList(mergeOverlappingIntervals[i][0],mergeOverlappingIntervals[i][1]));
                currentansindex++;
            }
        }
        return ans;
    }
}
