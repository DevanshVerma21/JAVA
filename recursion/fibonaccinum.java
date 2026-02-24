import java.util.Scanner;

public class fibonaccinum {
    public static int f(int n){
        if(n<=1){
            return n;
        }
        return f(n-1) + f(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        System.out.println(f(n));

    }
    
}
