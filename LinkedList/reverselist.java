import org.w3c.dom.Node;

public class reverselist {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node curr = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }

    public void printList(){
        if (head==null) {
            System.out.println("Empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        reverselist list = new reverselist();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.printList();

        list.head = list.reverse(list.head);

        list.printList();


    }
}
