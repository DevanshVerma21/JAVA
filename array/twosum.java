import java.util.HashMap;
import java.util.Scanner;

public class twosum {

    public int[] twosumindex(int nums[],int target){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements:");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        twosum solver = new twosum();
        int[] res = solver.twosumindex(nums, target);
        if (res != null && res.length == 2) {
            System.out.println("Indices: " + res[0] + ", " + res[1]);
        } else {
            System.out.println("No two-sum solution found.");
        }
        sc.close();


    }
}
