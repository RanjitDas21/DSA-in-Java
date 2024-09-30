public class implementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = temp;
                tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
            size++;

        }
        void insertAtStart(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = temp;
                tail = temp;
            }else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAtindex(int idx,int val) {
            Node n = new Node(val);
            Node temp = head;
            if(idx == size) { // if index is = size
                insertAtEnd(val);
                return;
            }else if(idx == 0) { // if index is = 0
                insertAtStart(val);
                return;
            }else if(idx < 0 || idx > size) {
                System.out.println("Wrong index");
                return;
            }
            for(int i = 0; i <idx-1; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            size++;
        }
        void deleteAt(int idx) {
            Node temp = head;
            if(idx == 0) {
                head = head.next;
                size--;
                return;
            }
            else if(idx == size-1) {
                for(int i = 1; i < idx; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                tail = temp;
                size--;
            }
            else {
                for(int i = 1; i < idx; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }

        }
        void print() {
           Node temp = head;
            System.out.println("the linkedlist element is :");
           while(temp != null) {
               System.out.print(temp.data+" ");
               temp = temp.next;
           }
        }
//        int size() {
//            Node temp = head;
//            int count = 0;
//            while(temp != null) { // size method.
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }
        int getAt(int idx) {
            if(idx < 0 || idx >= size) {
                System.out.println("Wrong index");
                return -1;
            }
            Node temp = head;
            for(int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(7);
//        ll.print();
//        System.out.println();
//        System.out.println("The size of the linkedlist is : "+ll.size);
        ll.insertAtStart(1);
//        ll.print();
        ll.insertAtindex(1,5); // 1,5,4,7
        ll.insertAtindex(2,10); // 1,5,10,4,7
        ll.print();
//        System.out.println();
//        System.out.println(ll.size);
//        System.out.println(ll.getAt(4));
        ll.deleteAt(4);
        System.out.println();
        ll.print();
        System.out.println();
        System.out.println(ll.tail.data);
//        System.out.println(ll.head.data);


    }
}
