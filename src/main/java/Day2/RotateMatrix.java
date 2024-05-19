package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateMatrix {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

    public static void rotate(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.get(0).size(); j++) {
                int temp = arr.get(i).get(j);
                arr.get(i).set(j, arr.get(j).get(i));
                arr.get(j).set(i, temp);
            }
        }
        int sizerow = arr.size();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() / 2; j++) {
                int temp = arr.get(i).get(j);
                arr.get(i).set(j, arr.get(i).get(sizerow - 1 - j));
                arr.get(i).set(sizerow - 1 - j, temp);

            }
        }
    }
}


