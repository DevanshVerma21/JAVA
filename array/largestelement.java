import java.util.*;

public class largestelement {
    public static int largest(int arr[]){
        int largest = arr[0];
        int n = arr.length;
        for(int i = 0;i<=n-1;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Laregst Element: "+largest(arr));

        sc.close();
    }
    
}
