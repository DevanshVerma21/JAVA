import java.util.Scanner;

public class insertionsort {
    public static void sort(int n, int[] arr){
        for(int i = 0;i<=n-1;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter "+ n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        sort(n, arr);

        System.out.println("The elements are : ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
