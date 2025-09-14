import java.util.ArrayList;
import java.util.Scanner;

public class mergesorting {

    public static void merge(int arr[],int s ,int m,int e){
        ArrayList<Integer>a1 = new ArrayList<Integer>();

        int l = s;
        int r = m + 1;

        while(l<=m && r<=e){
            if(arr[l]<arr[r]){
                a1.add(arr[l]);
                l++;
            }
            else{
                a1.add(arr[r]);
                r++;
            }
        }
        while(l<=m){
            a1.add(arr[l]);
            l++;
        }

        while (r <= e) {
            a1.add(arr[r]);
            r++;
        }


        for(int i = s;i<=e;i++){
            arr[i] = a1.get(i-s);
        }
    }
    public static void mergesort(int arr[],int s,int e){
        if(s<e){
            int m = s+(e-s)/2;
            mergesort(arr, s, m); // left
            mergesort(arr, m+1, e); // right
            merge(arr, s, m,e); // merging
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


        mergesort(arr,0,n-1);

        System.out.println("The elements are : ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
