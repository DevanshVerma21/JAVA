import java.util.Scanner;

public class freqarr {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = obj.nextInt();

        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        int mx = arr[0];
        for(int i = 0;i<n;i++){
            mx = Math.max(arr[i], mx);
        }

        int freq[] = new int[mx+1];

        for(int i = 0;i<n;i++){
            freq[arr[i]]++;
        }

        System.out.println("The frequency array:");
        for (int i = 0; i < mx+1; i++) {
            if(freq[i]>0){
                System.out.println(i+ "->" +freq[i]);
            }
        }
        obj.close();
    }
    
}
