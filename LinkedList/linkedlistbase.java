package LinkedList;

public class linkedlistbase {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //add - first
    public void addFirst(int data){
        Node  newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addLast(int data){
        Node  newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // delete first occurrence of key
    public void deleteByKey(int key){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        // If head is the key
        if(head.data == key){
            head = head.next;
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null && curr.data != key){
            prev = curr;
            curr = curr.next;
        }
        if(curr == null){
            System.out.println("Key not found");
            return;
        }
        prev.next = curr.next;
    }


    public void printList() {
        if (head == null) {
            System.out.println("No node found");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        linkedlistbase list = new linkedlistbase();

        list.addFirst(2);
        list.addFirst(5);
        list.addFirst(7);
        list.addLast(0);

        list.printList();
        list.deleteByKey(7);
        list.printList(); 
    }
}

