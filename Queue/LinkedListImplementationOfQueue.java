public class LinkedListImplementationOfQueue {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedListQueue {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val) {
            Node temp =new Node(val);
            if(size == 0) {
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int peek() {
            if(size == 0) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return head.data;
        }

        int remove() {
            if(size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

        void display() {
            if(size == 0) {
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            if(size == 0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        LinkedListQueue q1 = new LinkedListQueue();
        q1.display();
        q1.add(3);
        q1.add(8);
        q1.add(1);
        q1.add(9);
        q1.add(7);
        q1.display();
        System.out.println(q1.peek());
        q1.remove();
        q1.display();
        System.out.println(q1.size);

    }
}
