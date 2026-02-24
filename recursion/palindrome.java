public class palindrome {

    public static boolean ispalindrome(String s,int i){
        int n = s.length();

        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return ispalindrome(s, i+1);

    }

    public static void main(String[] args) {
        String str = "vfdc";
        //with recursion

        System.out.println(ispalindrome(str,0));

        //without recursion
        // int n = str.length();
        // boolean check = true;
        // for(int i = 0;i<n/2;i++){
        //     if(str.charAt(i)!=str.charAt(n-i-1)){
        //         check = false;
        //         break;
        //     }
        // }
        // if(check == true){
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("No");
        // }


    }
}
