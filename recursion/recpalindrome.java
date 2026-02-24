public class recpalindrome {

    public static boolean paliornot(int i,String word){
        int n = word.length();
        if(i>=n/2){
            return true;
        }
        if(Character.isLetterOrDigit(word.charAt(i)) != Character.isLetterOrDigit(word.charAt(n-i-1))){
            return false;
        }
        return paliornot(i+1,word);
    }
    public static void main(String[] args) {
        String word = "A man a plan a canal Panama";
        word = word.toLowerCase();
        System.out.println(paliornot(0,word));
    }
}
