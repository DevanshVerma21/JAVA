import java.util.Scanner;

public class revarray {
    public static void rev(int arr[],int n){
        int left = 0;
        int right = n-1;

        while(left <right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        rev(arr,n);
        System.out.println("Reversed Array");

        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
