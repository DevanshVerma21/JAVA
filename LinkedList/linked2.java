public class linked2 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add_start(int data) {
        Node nw = new Node(data);

        if (head == null) {
            head = nw;
            return;
        }
        nw.next = head;
        head = nw;
    }

    public void add_end(int data) {
        Node nw = new Node(data);
        if (head == null) {
            head = nw;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = nw;
    }

    public void add_k(int data, int k) {
        Node nw = new Node(data);
        if (head == null) {
            head = nw;
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
                return;

            }
            prev = curr;
            curr = curr.next;
        }
        prev.next = nw;
    }

    public void add_beforeval(int el, int val) {
        Node nw = new Node(el);

        if (head == null) {
            return;
        }
        if (head.data == val) {
            nw.next = head;
            head = nw;
            return;
        }

        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (curr.data == val) {
                prev.next = nw;
                nw.next = curr;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        linked2 list = new linked2();
        list.add_start(5);
        list.add_start(4);
        list.add_start(3);
        list.add_start(2);
        list.add_start(1);
        list.add_start(0);

        list.add_end(6);
        list.add_end(7);
        list.add_end(8);

        list.add_k(10, 9);

        list.add_beforeval(22, 5);

        list.printList();

    }

}
