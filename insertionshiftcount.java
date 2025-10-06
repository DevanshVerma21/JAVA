import java.util.Scanner;

public class insertionshiftcount {
public static int insertionsort(int arr[]){
    int n = arr.length;
    int shifts = 0;
    
    for(int i = 1; i < n; i++){
        int key = arr[i];
        int j = i - 1;
        int originalPos = i;
        
        // Count shifts while moving elements to the right
        while(j >= 0 && arr[j] > key){
            arr[j + 1] = arr[j];  // This is a shift
            shifts++;
            j--;
        }
        
        // Insert the key at correct position
        arr[j + 1] = key;
        
        // If key moved from its original position, count that as a shift too
        if(j + 1 != originalPos){
            shifts++;
        }
    } 
    return shifts;
}

     public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
            int swaps = insertionsort(arr);
            System.out.println(swaps);
        }
        sc.close();
    }
}
