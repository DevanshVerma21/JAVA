public class reversearrgroup {

    public static void reverse(int arr[],int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void reverseInGroups(int arr[],int k){
        int n = arr.length;
  
        for(int i = 0;i<n;i+=k){
            int left = i;
            int right = Math.min(k+i-1,n-1);
            
            reverse(arr, left, right);
        }

        
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int k = 3;

        reverseInGroups(arr, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
