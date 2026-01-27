import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class longconseseq {
    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        int n = arr.length;
        


        //O(n x n log(n))
        // Arrays.sort(arr);
        // int longest = 1;
        // int lastsmaller = Integer.MAX_VALUE;
        // int curr = 0;

        // for(int i = 0;i<n;i++){
        //     if(arr[i] - 1 == lastsmaller){
        //         curr += 1;
        //         lastsmaller = arr[i];
        //     }
        //     else if(lastsmaller != arr[i]){
        //         curr = 1;
        //         lastsmaller = arr[i];
        //     }
        //     longest = Math.max(longest,curr);
        // }

        // System.out.println(longest);





        //O(n^2)
        // int max = 0;
        // for (int x : arr) {
        //     if (x > max)
        //         max = x;
        // }

        // int[] freq = new int[max + 1];

        // for (int x : arr) {
        //     freq[x] = 1;
        // }

        // int length = 0;
        // int current = 0;

        // for (int i = 1; i < max; i++) {
        //     if (freq[i] == 1) {
        //         current++;
        //         length = Math.max(length, current);
        //     }
        //     else{
        //         current = 0;
        //     }
        // }
                                                    
        // System.out.println(length);

    }
}
