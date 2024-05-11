package Easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args)
    {
        int arr[] = {1,1,1,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0};
        int l = arr.length;
        int max1 = countmaxconsecutiveones(arr,l);
        System.out.print("maximum consecutive ones are " +max1);
    }

    public static int countmaxconsecutiveones(int[] arr, int l){
       int counter = 0, tempcounter = 0;
        for(int i = 0 ; i< l; i++)
            if(arr[i]==1)
            {
                tempcounter++;
                counter = Math.max(tempcounter,counter);
                
            }
        else tempcounter = 0;

        return counter;
    }
}


