import java.util.Scanner;
import java.util.*;

public class intersectionarr {
    public static void intersection(int arr1[], int arr2[], ArrayList<Integer> arr) {
        int n = arr1.length;
        int m = arr2.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    if (arr[i]+1 == arr2[j]) {
                        continue;
                    } else {
                        arr.add(arr1[i]);
                        break;

                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 4, 5 };
        int[] arr2 = { 2, 3, 4, 5 };
        ArrayList<Integer> arr = new ArrayList<>();
        intersection(arr1, arr2, arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

}
