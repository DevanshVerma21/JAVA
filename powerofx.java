import java.util.Scanner;

public class powerofx {
    public static int powerbase(int base,int exp){
        if(exp == 0){
            return 1;
        }
        if(exp<0){
            return -1;
        }

        long half = powerbase(base, exp/2);
        if(exp %2 == 0){
            return half * half;
        }
        else{
            return base*half*half;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the exp: ");
        int exp = sc.nextInt();

        System.out.println(powerbase(base, exp));

    }
    
}
