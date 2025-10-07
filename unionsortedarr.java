import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class unionsortedarr {
    public static int[] union(int arr1[], int arr2[]) {
        int size1 = arr1.length;
        int size2 = arr2.length;

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < size1; i++) {
            temp.add(arr1[i]);
        }
        for (int i = 0; i < size2; i++) {
            if (!temp.contains(arr2[i])) {
                temp.add(arr2[i]);
            }
        }

        int[] result = new int[temp.size()];
        for (int k = 0; k < temp.size(); k++) {
            result[k] = temp.get(k);
        }
        return result;
    }

    public static int[] removeduplicate(int arr[]) {
        int n = arr.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return Arrays.copyOfRange(arr, 0, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size1: ");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter size2: ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Union Array:");
        int result[] = removeduplicate(union(arr1, arr2));
        System.out.println(Arrays.toString(result));

    }
}
