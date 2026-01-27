public class gardenbeautiful {
    public static void main(String[] args) {
        int arr[] = {5,3,6,3,7};
        // int arr[] = {1,4,5,3,8,2};
        int n = arr.length;
        int max = 0;
        int s = arr[0];
        int l = arr[n-1];

        for(int i = 1;i<=n-2;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int sum = max + s + l;

        if(s <= l){
            sum -= s;
        }
        else if(s>l){
            sum -= l;
        }

        System.out.println(sum);
    }
}
