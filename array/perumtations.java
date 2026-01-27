import java.util.Arrays;

public class perumtations {
    public static void permute(int arr[],int index){
        int n = arr.length;
        if(index == n){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i = index;i<n;i++){
            swap(arr,index,i);
            permute(arr, index+1);
            swap(arr,index,i);
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        permute(arr,0);
    }
}
