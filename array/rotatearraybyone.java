import java.util.Scanner;

public class rotatearraybyone {
    static int[] rotatearray(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        rotatearray(arr);
        
        System.out.println("Rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }

}
