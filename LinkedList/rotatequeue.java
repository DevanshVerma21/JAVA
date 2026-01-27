import java.util.ArrayDeque;
import java.util.Queue;

class rotatequeue {
    public static void main(String[] args){
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);

        while(!q1.isEmpty()){
            q2.offer(q1.poll());
            int n = q2.size();
            for(int i = 0; i < n - 1; i++){
                q2.offer(q2.poll());
            }
        }

        while(!q2.isEmpty()){
            System.out.println(q2.poll());
        }
    }
}
