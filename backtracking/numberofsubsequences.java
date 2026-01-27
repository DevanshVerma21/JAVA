import java.util.*;

public class numberofsubsequences {
    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        subseq(s,ans,0);     
    }

    public static void subseq(String s,String ans,int i){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        subseq(s, ans, i+1);
        subseq(s, ans + s.charAt(i), i+1);
    }
}
