import java.util.Scanner;

public class bubbleesort {

    public static int sort(int arr[],int n){
        int count = 0;
        for(int i = n-1;i>=0;i--){
            boolean flag = false;
            for(int j = 0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int co = sort(arr,n);
        System.out.println("swaps count: "+co);

        System.out.println("Elements after sorting:");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
