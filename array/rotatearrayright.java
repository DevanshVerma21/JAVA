import java.util.ArrayList;

public class rotatearrayright {

    public static void rightrotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        int n = arr.length;

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        rightrotate(arr, k);

        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
