import java.util.*;
public class substringfunction {
    public static String substring(String str, int s,int e) {
        if(s<0 || e>str.length() || s>e){
            System.out.println("Invalid");
            return "ESE hi";
        }

        char arr[] = new char[e-s];
        for(int i = s;i<e;i++){
            arr[i-s] = str.charAt(i);
        }

        return new String(arr);

    }
    public static void main(String[] args) {
        String s = "devanshverma";

        // String ans = substring(s,3,7);
        String ans2 = substring(s,-1,62);

        // System.out.println(ans);
        System.out.println(ans2);
    }
    
}
