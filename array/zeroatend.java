import java.util.ArrayList;
import java.util.Scanner;

public class zeroatend {
        //brute force

    public static void zeroend(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();

        // Add all non-zero elements to ArrayList
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        // Copy non-zero elements back to array
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        // Fill remaining positions with zeros
        for (int i = temp.size(); i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void optimalzeroatend(int arr[]){
        int n = arr.length;

        int j= -1;
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }

        for(int i = j+1;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // zeroend(arr);
        optimalzeroatend(arr);


        System.out.println("New Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
