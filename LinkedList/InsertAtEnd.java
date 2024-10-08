// Insert an element at the end of the LinkedList by using head.

public class InsertAtEnd {
    public static void insertAtEnd(Node head,int val) {
        Node n = new Node(val);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        insertAtEnd(a,10);
        display(a);
    }
}
