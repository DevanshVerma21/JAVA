import java.util.ArrayList;

public class subseqwithsumk {
    public static void subseq(int i,int nums[],ArrayList<Integer> result,int s,int sum){
        boolean check = false;
        if(i==nums.length){
            if(s== sum){
                System.out.println(result);
            }
            return;
        }

        result.add(nums[i]);
        subseq(i+1, nums, result,s + nums[i], sum);

        result.remove(result.size()-1);
        subseq(i+1, nums, result,s, sum);
    }
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        int nums[] = {1,2,1};
        int sum = 2;

        subseq(0,nums,result,0,sum);


    }
}
