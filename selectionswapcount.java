import java.util.*;

public class selectionswapcount {

    public static int selectionsort(int arr[]) {
        int n = arr.length;
        int swaps = 0;
        boolean flag;
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            swaps++;
        }
        return swaps;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int swaps = selectionsort(arr);
            System.out.println(swaps);
        }
        sc.close();
    }
}
