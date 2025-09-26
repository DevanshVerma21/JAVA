import java.util.ArrayList;
import java.util.Scanner;

public class mergesorting {
    public static void merge(int arr[],int low,int mid,int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left++]);
            }
            else{
                list.add(arr[right++]);
            }
        }
        while(left<=mid){
            list.add(arr[left++]);
        }
        while(right<=high){
            list.add(arr[right++]);
        }


        for(int i = low; i <= high; i++){
            arr[i] = list.get(i - low);
        }

    }

    public static void mergesort(int arr[],int low,int high) {
        if(low>=high) return;
        int mid = low + (high-low)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        mergesort(arr,0,n-1);

        System.out.println("Sorted Array: ");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }

    
}
