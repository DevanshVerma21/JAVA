public class powerset {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        
        int total = (1<<n);
        
        for(int i = 0;i<total;i++){
            StringBuilder sb = new StringBuilder();

            for(int j = 0;j<n;j++){
                if((i &(1<<j)) != 0){
                    sb.append(str.charAt(j));
                }
            }

            System.out.println(sb.toString());
        }

    }
}
