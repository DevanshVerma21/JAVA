import java.util.*;
public class binary {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int target = 4;
        int start = 0;
        int end = n-1;
        boolean flag = false;
        


        while(start<=end){
            int mid = start + (end - start)/2;
            if(target>arr[mid]){
                start = mid +1;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            }
            else{
                System.out.println("Element found at index: " + mid);
                flag = true;
                break;   
            }
        }
        if (!flag) {
            System.out.println("Element not found");
        }
    }
}
