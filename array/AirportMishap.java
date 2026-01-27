import java.util.*;

public class AirportMishap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // number of flights

        while (T-- > 0) {
            int m = sc.nextInt(); // total bags checked in
            int n = sc.nextInt(); // total bags arrived (m - 1)

            int[] depart = new int[m];
            int[] arrive = new int[n];

            // Read departure bags
            for (int i = 0; i < m; i++) {
                depart[i] = sc.nextInt();
            }

            // Read arrival bags
            for (int i = 0; i < n; i++) {
                arrive[i] = sc.nextInt();
            }

            // Find and print missing bag
            System.out.println(findMissing(depart, arrive));
        }
        sc.close();
    }

    static int findMissing(int[] depart, int[] arrive) {
        int n = depart.length;
        int m = arrive.length;

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0;i<n;i++){
            sum1 += depart[i];
        }

        for(int i = 0;i<m;i++){
            sum2 += arrive[i];
        }

        return sum1-sum2;
    }
}
