import java.util.Scanner;

public class bubblesort {
    public static void sort(int arr[], int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static boolean check(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (check(arr, n) == true) {
            System.out.println("Sorted Array: ");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        } else {

            sort(arr, n);
            System.out.println("Sorted Array: ");

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
