import java.util.Scanner;

public class insertsort {

    public static int sort(int arr[], int n) {
        int shift = 0;

        for(int i = 0;i<n;i++){
            int key = arr[i];
            int j = i-1;
            int orgpos = i;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
                shift++;
            }
            arr[j+1] = key;

            if(j+1 != orgpos){
                shift++;
            }
        }
        return shift;

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int shift = sort(arr, n);
        System.out.println("Shift:"+shift);


        System.out.println("Sorted Array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
