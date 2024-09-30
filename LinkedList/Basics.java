public class Basics {
    public static class Node {
        int data; //value
        Node next; // address of next node
        Node(int data) {
            this.data = data;
        }
    }

    public static void print(Node head) {
        while(head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static void printRecursively(Node head) {
        if(head == null) return;
        System.out.print(head.data+" ");
        printRecursively(head.next);
    }

    public static void printReverseRecursively(Node head) {
        if(head == null) return;
        printReverseRecursively(head.next);
        System.out.print(head.data+" ");
    }


    public static void main(String[] args) {
        Node a = new Node(5); // head node
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16); // tail node

        a.next = b; // 5->3 9 8 16
        b.next = c; // 5->3->9 8 16
        c.next = d; // 5->3->9->8 16
        d.next = e; // 5->3->9->9->16
//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(a.next.data);     // print LinkedList manually.
//        System.out.println(c.data);
//        System.out.println(a.next.next.data);

        print(a);
        System.out.println();
        printRecursively(a);
        System.out.println();
        printReverseRecursively(a);
        System.out.println();

        Node temp1 = a;
        for(int i = 1; i <= 5; i++) {
            System.out.print(temp1.data + " ");   // print LinkedList using for loop.
            temp1 = temp1.next;
        }
        System.out.println();

        Node temp2 = a;
        while(temp2 != null) {
            System.out.print(temp2.data+" "); // print LinkedList using while loop.
            temp2 = temp2.next;
        }



    }
}
