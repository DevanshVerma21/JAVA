import java.util.*;

public class secondlargest {
    //less optimal solution as it takes 2n
    public static int secondlarge(int arr[]){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        for(int i = 0;i<n;i++){
            if(arr[i]>seclarge && arr[i]!=largest){
                seclarge = arr[i];
            }
        }
        if(seclarge == Integer.MIN_VALUE){
            return -1;
        }

        return seclarge;

    }
    //it will take only n as it will go in one pass
    public static int bettersecondlargest(int arr[]){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MAX_VALUE;

        for(int i =0;i<n;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>largest && arr[i]>secondlargest){
                secondlargest = arr[i];
            }
        }
        if(secondlargest==Integer.MIN_VALUE){
            return -1;
        }

        return secondlargest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println("Second Largest: "+secondlarge(arr));
        System.out.println("Second Largest: "+bettersecondlargest(arr));

        sc.close();
    }

    
}
