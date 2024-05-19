package Day1;

import java.util.Arrays;
import java.util.List;

public class NextPermutation {
    public static void main(String args[]) {
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
    public static List<Integer> nextGreaterPermutation(List<Integer> input)
    {
        int breakpoint = 0;

        for(int i = input.size()-1; i>0; i--)
        {
            if(input.get(i-1)<input.get(i))
            {
                breakpoint = i-1;
                break;
            }

        }
        for(int i = input.size()-1; i>breakpoint; i--)
        {
        if(input.get(i)>input.get(breakpoint))
        {
            int temp = input.get(i);
            input.set(i,input.get(breakpoint)) ;
            input.set(breakpoint,temp);
            break;
        }
        }
        int left = breakpoint+1;
        int right  = input.size()-1;
        while(left<right)
        {
            int temp = input.get(left);
            input.set(left,input.get(right));
            input.set(right,temp);
            left++;
            right--;
        }

        return input;

    }
}
