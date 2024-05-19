package Day2;

public class RepeatMissingNumber {

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                + ans[0] + ", " + ans[1] + "}");
    }

    public static int[] findMissingRepeatingNumbers(int[] ans) {
        {

            int l = ans.length;
            int sumofarray = 0;
            int sumofsquarearray = 0;
            int sumofN = (l*(l+1))/2;
            int sumNsquare = (l*(l+1)*((2*l)+1))/6;
            for(int i = 0; i<l;i++)
            {
                sumofarray = sumofarray+ans[i];
                sumofsquarearray = sumofsquarearray + (ans[i]*ans[i]);
            }
            int sumDifference = sumofN - sumofarray; //X -Y
            int squareDifference = sumNsquare - sumofsquarearray; // (X+Y)(X-Y)
            int xPlusy = squareDifference/sumDifference;
            int x = (sumDifference + xPlusy)/2;
            //int y = (sumDifference - xPlusy)/2;
           int y =- sumDifference + x;

            ans[0] = x;
            ans [1] = y;
            return ans;
        }
    }
}
