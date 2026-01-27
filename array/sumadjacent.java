import java.util.*;

class sumadjacent {

    public static long largestNonAdjacentSum(long[] arr) {
        long prev2 = 0;
        long prev1 = 0;

        for (long x : arr) {
            long curr = Math.max(prev1, prev2 + x);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.println(largestNonAdjacentSum(arr));
    }
}
