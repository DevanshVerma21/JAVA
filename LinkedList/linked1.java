public class linked1 {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void lengthofll() {
        int length = 0;
        Node curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        System.out.println("Length: " + length);
    }

    public void delete_head() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        head = head.next;
    }

    public void delete_end() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        Node prev = null;

        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;

    }

    public void delete_kth(int k) {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (k == 1) {
            head = head.next;
            return;
        }

        int cnt = 0;
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = curr;
            curr = curr.next;

        }

    }

    public void delete_val(int val){
        if(head == null){
            System.out.println("Empty");
            return;
        }

        if(head.data == val){
            head = head.next;
            return;
        }

        Node curr = head;
        Node prev = null;

        while(curr != null){
            if(curr.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Not found");


    }





    public void printList() {
        if (head == null) {
            System.out.println("Empty");
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linked1 list = new linked1();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        // list.lengthofll();
        list.printList();

        // list.delete_head();
        // list.delete_end();
        // list.printList();

        // list.delete_kth(3);
        // list.printList();

        // list.delete_kth(3);
        // list.printList();

        list.delete_val(3);
        list.printList();

    }
}
