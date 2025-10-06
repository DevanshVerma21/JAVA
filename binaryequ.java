import java.util.Scanner;

public class binaryequ {
    public static int binary(int n){
        if(n==0){
            return 0;
        }
        return binary(n/2)*10 + (n%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = sc.nextInt();
    }
    
}
