import java.util.*;

public class subsequenceprint {

    public static void subseq(int i,int arr[],ArrayList<Integer> list,int n){
        if(i>=n){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        subseq(i+1, arr, list, n);
        list.remove(list.size()-1);
        subseq(i+1, arr, list, n);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {1, 2, 3};
        int n = arr.length;

        subseq(0, arr, list, n);
    }
}