import java.util.Scanner;

public class sortarr {

    public static void bubblesort(int n, int[] arr){
        boolean flag;
        for(int i = 0; i < n-1; i++){
            flag = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }  
            }
            if(!flag){
                break;
            }
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


        bubblesort(n, arr);

        System.out.println("The elements are : ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
