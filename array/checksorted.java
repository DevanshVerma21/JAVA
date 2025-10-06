import java.util.Scanner;

public class checksorted {
    public static boolean check(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]<=arr[i+1]){
                return true;
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(check(arr)==true){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Unsorted");
        }
    }
    
}
