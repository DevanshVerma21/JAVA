public class countsubseqwithsumk {

    public static int subseq(int i,int nums[],int s,int sum){
        if(i == nums.length){
            if(s == sum){
                return 1;
            }
            else{
                return 0;
            }
        }

        int l = subseq(i+1, nums, s+nums[i], sum);
        int r = subseq(i+1, nums, s, sum);

        return l + r;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1};
        int sum = 2;

        System.out.println(subseq(0,nums,0,sum));
    }
}
