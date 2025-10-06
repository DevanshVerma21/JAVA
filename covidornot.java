import java.util.*;

public class covidornot {
    public static boolean covid(String s){
        int n = s.length();
        
        for(int i = 0; i < n - 4; i++){
            char ch = s.charAt(i);
            if(ch == 'x'){
                // Check if there's a 'y' exactly 4 positions later (3 gaps in between)
                if(s.charAt(i + 4) == 'y'){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(covid(s)==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
