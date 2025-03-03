import java.util.Queue;

public class ArrayImplementationOfQueue {

    public static class QueueArray {
        int f = -1;
        int r = -1;
        int size = 0;
        private int arr[] = new int[10];
        void add(int val) {
            if(r == arr.length-1) {
                System.out.println("Queue is full");
                return;

            }
            if(f == -1) {
                f = r = 0;
                arr[0] = val;
            }
            else {
                arr[r+1] = val;
                r++;
            }
            size++;
        }
        int remove() {
            if(size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }
        int peek() {
            if(size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        boolean isEmpty() {
            if(size == 0) {
                return true;
            }else return false;
        }
        void display() {
            if(size == 0) {
                System.out.println("Queue is empty");
            }
            else {
                for(int i = f; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueArray q1 = new QueueArray();
        q1.add(2);
        q1.add(5);
        q1.add(1);
        q1.add(9);
        q1.add(7);
        q1.display();
        System.out.println(q1.size);
        q1.remove();
        q1.display();
        System.out.println(q1.peek());

    }
}
