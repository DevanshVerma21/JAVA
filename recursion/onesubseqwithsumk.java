import java.util.ArrayList;

public class onesubseqwithsumk {
    public static boolean subseq(int i,int[] nums,ArrayList<Integer> result,int s,int sum){
        if(i== nums.length){
            if(s == sum){
                System.out.println(result);
                return true;
            }
            return false; 
        }

        result.add(nums[i]);
        if(subseq(i+1, nums, result, s+ nums[i], sum)){
            return true;
        }
        result.remove(result.size()-1);
        if(subseq(i+1, nums, result, s, sum)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        int nums[] = {1,2,1};
        int sum = 2;

        subseq(0,nums,result,0,sum);
    }
    
}
