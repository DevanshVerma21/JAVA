package LinkedList;

public class circularlinkedlist {
    Node head;
    Node tail;

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
            tail = nw;
            tail.next = head;
            return;
        }
        nw.next = head;
        head = nw;
        tail.next = head;

    }

    public void add_end(int data) {
        Node nw = new Node(data);

        if (head == null) {
            head = nw;
            tail = nw;
            tail.next = head;
            return;
        }
        tail.next = nw;
        tail = nw;
        tail.next = head;

    }

    // basicaly removing from head
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        Node prev = tail;

        if (head == tail && head.data == data) {
            head = null;
            tail = null;
            return;
        }

        do {
            if (curr.data == data) {
                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                }

                else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                }

                else {
                    prev.next = curr.next;
                }
                return;

            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Not found");

    }

    public void printList() {
        if (head == null) {
            System.out.println("No node found");
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.data);
            curr = curr.next;
            if (curr != head)
                System.out.print(" -> ");
        } while (curr != head);
        System.out.println(" -> (back to head)");
    }

    public static void main(String[] args) {
        circularlinkedlist list = new circularlinkedlist();

        list.add_start(3);
        list.add_start(2);
        list.add_start(1);
        list.add_end(4);
        list.add_end(5);

        list.printList();

        list.delete(3);
        list.printList();

        list.delete(1);
        list.printList();

        list.delete(5);
        list.printList();


    }

}
