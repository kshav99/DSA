package Day8;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;
    public  Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

public class Knapsack {
        public static void main(String args[])
        {
            int n = 3, weight = 50;
            Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};
            double ans = fractionalKnapsack(weight, arr, n);
            System.out.println("The maximum value is "+ans);
        }
    public static  double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr, (o1,o2) -> (o2.value / o2.weight) - (o1.value / o1.weight));
        int maxValue  = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int currentWeight =  arr[i].weight;
            int currentValue = arr[i].value;
            int remaingWeight = W - currentWeight;
            if(remaingWeight >= 0){
                maxValue += currentValue;
                W = remaingWeight;
            }
            else {
                maxValue += ((double)W/(double) currentWeight) * (double) currentValue;
            }

        }
        return maxValue;
    }
    public class itemComparator implements Comparator<Item>{
        @Override
        public int compare(Item o1, Item o2) {
            double r1 = (double)(o1.value) / (double)(o1.weight);
            double r2 = (double)(o2.value) / (double)(o2.weight);
            if(r1<r2)
                return 1;
            else if(r1>r2) return -1;
            else return 0;
        }
    }

}



