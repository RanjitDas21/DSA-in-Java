// Implement a method to find out the length of a Linked List(Iterative and Recursive).

public class findLength {
    public static int calculateLength(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static int calculateLengthRecursively(Node head) {
        if(head == null) return 0;
        int count = calculateLengthRecursively(head.next);
        return 1 + count;  /// ***
    }
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

       System.out.println(calculateLength(a));
       System.out.println(a.data);
        int length = calculateLengthRecursively(a);
        System.out.println(length);
        System.out.println(a.data);
    }
}
