package Day1;

public class Kadane {
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }


    public static long maxSubarraySum(int[] arr, int n) {

        long sum = Long.MIN_VALUE;;
        int sumsofar=0;
        String array = "";

        for (int i = 0; i < n; i++) {

            sumsofar = sumsofar+arr[i];
           if(sumsofar>sum)
           {
               sum = sumsofar;
               array += arr[i] + ",";

           }

           if(sumsofar < 0){
               sum = 0;
               sumsofar = 0;
           }
//           if (sumsofar>=0 && sumsofar < sum)
//           {
//               array += arr[i] + ",";
//           }
//            else
//            {
//                sumsofar = 0;
//                sum = 0;
//                array = "";
//            }

            }

       System.out.println(array);
        return sum;
        }

}
