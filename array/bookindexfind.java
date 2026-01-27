import java.util.*;

class BookIndexFind {

    static long totalSearchTime(int N, int books[], int booksToFind[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<N;i++){
            map.put(books[i], i);
        }

        long totaltime = 0;
        for(int x : booksToFind){
            if(map.containsKey(x)){
                totaltime += map.get(x);
            }
            else{
                totaltime += N;
            }
        }
        return totaltime;

       
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of books
        int N = sc.nextInt();
        int[] book_IDs = new int[N];

        for (int i = 0; i < N; i++) {
            book_IDs[i] = sc.nextInt();
        }

        // Number of books to find
        int K = sc.nextInt();
        int[] booksToFind = new int[K];

        for (int i = 0; i < K; i++) {
            booksToFind[i] = sc.nextInt();
        }

        // Call function
        long result = bookindexfind.totalSearchTime(N, book_IDs, booksToFind);

        // Print result
        System.out.println(result);

        sc.close();
    }
}
