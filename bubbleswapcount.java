import java.util.*;
public class bubbleswapcount {
// Other imports go here
// Do NOT change the class name
    public static int bubblesort(int arr[]){
        int n = arr.length;
        int swaps = 0;
        
        for(int i = 0; i < n-1; i++){
            boolean swap = false;
            for(int j = 0; j < n-1-i; j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swaps++;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        return swaps;    
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
            
            int swaps = bubblesort(arr);
            System.out.println(swaps);
        }
        sc.close();
    }
}
    

