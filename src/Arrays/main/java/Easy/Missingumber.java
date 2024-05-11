package Easy;

public class Missingumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        int n=4;
        System.out.println("the missing number is " + missing(arr,n));

    }
public static int missing(int[] arr,int n){
        int XOR1 = 0;
        int XOR2 = 0;
        int l = arr.length;
        for(int i = 0; i<l; i++)
        {
            XOR2=XOR2^arr[i];
            XOR1 = XOR1 ^ (i+1);
        }
        XOR1 = XOR1 ^ n;
        return XOR1 ^ XOR2;
}


}