package Arrays.Basics;

public class CheckIfSortedArray {

    public static void main(String[] args){
        int arr[] = {1,2,3,4,50,43};
        int l =  arr.length;
        if(isSorted(arr,l))
        {System.out.print("The array is sorted");}
        else {System.out.print("the array is  not sorted");}

    }
    public static boolean isSorted(int[] arr, int l) {
        if (l <= 1) {
            return true;
        }

        for (int i = 0; i < l - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}