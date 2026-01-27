import java.util.ArrayDeque;
import java.util.Queue;

public class rotatequeue2 {
    public static void rev(Queue<Integer> q1) {
        if (q1.isEmpty()) return;
        int ans = q1.poll();
        rev(q1);
        System.out.println(ans);
        q1.offer(ans);
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);

        // rev(q1);

        System.out.println("After rev: " + q1);
    }
}
