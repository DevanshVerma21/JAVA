public class linked4 {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void add_start(int data) {
        Node nw = new Node(data);
        if (head == null) {
            head = tail = nw;
            return;
        }

        nw.next = head;
        head.prev = nw;
        head = nw;
    }

    public void add_end(int data) {
        Node nw = new Node(data);
        if (head == null) {
            head = tail = nw;
            return;
        }

        tail.next = nw;
        nw.prev = tail;
        tail = nw;
    }

    public void add_k(int data, int k) {
        Node nw = new Node(data);
        if (head == null) {
            head = nw;
            tail = nw;
            return;
        }

        if (k == 1) {
            nw.next = head;
            head = nw;
            return;
        }

        int count = 0;
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            count++;
            if (count == k) {
                prev.next = nw;
                nw.next = curr;

            }
            prev = curr;
            curr = curr.next;

        }

    }

    public void delete_start() {
        if (head == null) {
            System.out.println("Empty");
        }

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void delete_end() {
        if (head == null) {
            System.out.println("Empty");
        }

        if (tail.prev == null) {
            head = null;
            tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "<->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linked4 list = new linked4();

        list.add_start(3);
        list.add_start(7);
        list.add_start(2);

        list.add_end(1);
        list.add_end(4);
        list.add_end(8);

        list.printList();

        list.delete_start();
        list.printList();

        list.delete_end();
        list.printList();

    }
}
