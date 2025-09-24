import java.util.Scanner;

public class freqstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = sc.nextLine();
        int n = str.length();

        int freq[] = new int[256];

        for(int i = 0;i<n;i++){
            char ch = str.charAt(i);
            freq[(int)ch]++;
        }

        for(int j = 0;j<256;j++){
            if(freq[j]>0){
                System.out.println((char)j + " -> " + freq[j]);
            }
        }
    }
    
}
