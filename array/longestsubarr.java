public class longestsubarr {

    public static int longestArr(int arr[],int sum){
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum == sum) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    public static void main(String args[]) {
        int sum = 3;
        int arr[] = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};

        int result = longestArr(arr, sum);
        System.out.println("Longest subarray length: " + result);
    }
}
