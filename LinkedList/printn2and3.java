import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class printn2and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) return;

        Queue<String> q = new ArrayDeque<>();
        q.offer("2");
        q.offer("3");

        StringBuilder out = new StringBuilder();
        int count = 0;
        while (count < n && !q.isEmpty()) {
            String s = q.poll();
            if (count > 0) out.append(",");
            out.append(s);
            count++;
            q.offer(s + "2");
            q.offer(s + "3");
        }

        System.out.println(out.toString());
    }
}
