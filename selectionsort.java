import java.util.*;

public class selectionsort{

    public static void sort(int n, int[] arr){
        for(int i = 0;i<n-1;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
    }



    
}
