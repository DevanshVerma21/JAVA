import java.util.Scanner;

public class printname {

    public static void print(int n,String name){
        if(n<=0){
            return;
        }
        System.out.println(name);
        print(n-1,name);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        print(n,name);
    }
    
}
