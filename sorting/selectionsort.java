import java.util.Arrays;
import java.util.Scanner;

// it basically works on selecting a min from array and then swapping it
//it works on a time complexity of O(n^2) in every case
// adding a check to it can make it run in O(n)

public class selectionsort {

    public static void sorting(int arr[], int n) {
        for (int i = 0; i <= n - 2; i++) {
            int min = i; // remember this always
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
    

    public static boolean check(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (check(arr, n) == true) {
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        } else {

            sorting(arr, n);

            System.out.println("The elements after sorting are: ");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
