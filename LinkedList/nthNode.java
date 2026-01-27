import java.util.*;

public class nthNode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node findNlast(Node head,int n){
        
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        Node head = null;
        Node tail = null;

        for(int i = 0;i<N;i++){
            int val = sc.nextInt();
            Node nw = new Node(val);
            if(head == null){
                head = nw;
                tail = nw;
            }
            else{
                tail.next = nw;
                tail = nw;
            }

            int K = sc.nextInt();

            Node result = findNlast(head,K);
            if(result == null){
                System.out.println("null");
            }
            else{
                System.out.println(result);
            }

        }
    }

    
}
