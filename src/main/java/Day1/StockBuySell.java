package Day1;

public class StockBuySell {
    public static void main(String[] args) {
        int arr[] = {7,4,8,3,6,4};

        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);

    }
    public static int maxProfit(int[] arr)
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length;i++)
        {
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit , arr[i]-minPrice);

        }
        return maxProfit;
    }



}
