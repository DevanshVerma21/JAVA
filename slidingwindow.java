import java.nio.MappedByteBuffer;
import java.util.Scanner;

public class slidingwindow {

    public static int Sliding_Window_max_sum_subarray(int arr[],int n,int k){
        int sum = 0;

        if(k>n){
            return Integer.MIN_VALUE;
        }

        for(int i = 0;i<k;i++){
            sum+=arr[i];
        }

        int mx = sum;
        for(int i = k;i<n;i++){
            sum += arr[i] - arr[i-k];
            mx = Math.max(mx, sum);
        }

        return mx;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size pf array: ");
        int n = sc.nextInt();

        System.out.println("Enter the window size: ");
        int k = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = Sliding_Window_max_sum_subarray(arr, n, k);
        if (result == -1) {
            System.out.println("Window size cannot be greater than array size.");
        } else {
            System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
        }

        sc.close();

    }
}
