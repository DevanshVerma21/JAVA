import java.util.ArrayList;
import java.util.Scanner;

public class quicksorting {

    public static int partition(int arr[], int s, int e) {
        int p = arr[s];
        int l = s;
        int r = e;

        while (l < r) {
            while (arr[l] <= p)
                l++;
            while (arr[r] > p)
                r--;
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        // Place pivot in correct position
        int temp = arr[s];
        arr[s] = arr[r];
        arr[r] = temp;
        return r;

    }

    public static void quicksort(int arr[], int s, int e) {
        if (s >= e)
            return;
        int p = partition(arr, s, e);
        quicksort(arr, s, p - 1);// left
        quicksort(arr, p + 1, e);// right
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quicksort(arr, 0, n - 1);

        System.out.println("The elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
