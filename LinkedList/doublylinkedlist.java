
// package LinkedList;
import java.util.*;

public class doublylinkedlist {
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
            head = nw;
            tail = nw;
            return;
        }
        nw.next = head;
        head.prev = nw;
        head = nw;
    }

    public void add_end(int data) {
        Node nw = new Node(data);
        if (head == null) {
            head = nw;
            tail = nw;
            return;
        }
        tail.next = nw;
        tail.prev = tail;
        tail = nw;
    }

    public void printList() {
        if (head == null) {
            System.out.println("No node found");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" <-> ");
            }
            curr = curr.next;
        }
        System.out.println(" <-> null");
    }

    public static void main(String[] args) {
        doublylinkedlist list = new doublylinkedlist();

        list.add_start(5);
        list.add_start(4);
        list.add_start(3);
        list.add_start(2);
        list.add_start(1);

        list.add_end(7);
        list.add_end(8);
        list.add_end(9);

        list.printList();
    }

}
