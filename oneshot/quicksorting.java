import java.util.Scanner;

public class quicksorting {

    public static int pivot_position(int arr[], int s, int e) {
        int l = s;
        int r = e;

        int p = arr[s];

        while (l < r) {
            while (arr[l] <= p) {
                l++;
            }
            while (arr[r] > p) {
                r--;
            }
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        int temp = arr[s];
        arr[s] = arr[r];
        arr[r] = temp;
        return r;
    }

    public static void quicksort(int arr[], int s, int e) {
        int l = s;
        int r = e;
        if (s >= e)
            return;
        int p = pivot_position(arr, s, e);
        quicksort(arr, s, p - 1);
        quicksort(arr, p + 1, e);

    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = obj.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        quicksort(arr, 0, n - 1);

        System.out.println("The sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
