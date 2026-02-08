public class printnto1 {
    public static void print(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        print(i-1,n);
    }
    public static void main(String[] args) {
        int n = 5;
        print(5,n);
    }
    
}
