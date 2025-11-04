public class linked3 {
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

    public void delete_start() {
        if (head == null) {
            System.out.println("Empty");
        }
        head = head.next;
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

    public void delete_end() {
        if (head == null) {
            System.out.println("Empty");
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

    public void printList() {
        if (head == null) {
            System.out.println("No node found");
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void element(int element) {
        Node curr = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        int index = 1;

        while (curr != null) {
            if (curr.data == element) {
                System.out.println("Found at " + index);
                return;

            }
            curr = curr.next;
            index++;
        }

        System.out.println("Not found");

    }

    public static void main(String[] args) {
        linked3 list = new linked3();

        list.add_start(6);
        list.add_start(2);
        list.add_start(5);
        list.add_start(3);

        list.add_end(1);
        list.add_end(9);

        list.printList();

        // list.delete_start();
        // list.printList();

        // list.delete_end();
        // list.printList();

        list.element(1);
        list.element(2);
        list.element(10);

    }
}
