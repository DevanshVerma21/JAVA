import java.util.ArrayList;

public class Leadersinarray {
    public static void leadersarray(int[] arr, ArrayList<Integer> list) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) list.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> list = new ArrayList<>();
        leadersarray(arr, list);
        for (Integer v : list) {
            System.out.println(v);
            
        }
    }
}
