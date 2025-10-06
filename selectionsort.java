import java.util.Scanner;

public class selectionsort{

    public static void sort(int n,int arr[]) {
        for(int i = 0;i<=n-2;i++){
            int min = i;
            for(int j = i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(n, arr);
        System.out.println("Sorted Array: ");

        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}