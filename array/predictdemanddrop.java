import java.util.*;

class predictdemanddrop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] demand = new int[n];

            for (int i = 0; i < n; i++) {
                demand[i] = sc.nextInt();
            }

            preDemandDrop(demand, n);
            System.out.println();
        }
        sc.close();
    }

    public static void preDemandDrop(int[] demand, int n) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];

        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=demand[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] =  -1;

            }
            else{
                res[i] = st.peek();
            }
            st.push(demand[i]);
        }

        for(int i = 0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
