public class ArrayImplementationOfCircularQueue {

    public static class CircularQueue {
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[5];

        void add(int val) throws Exception {
            if(size == arr.length) {
                throw new Exception("Queue is Full");
            }
            else if(size == 0) {
                f = r = 0;
                arr[0] = val;
            }
            else if(r == arr.length-1) {
                r = 0;
                arr[0] = val;
            }
            else if(r < arr.length-1) {
                arr[++r] = val;
            }
            size++;
        }

        int remove() throws Exception {
            if(size == 0) {
                throw new Exception("Queue is empty");
            }
            else {
                int val = arr[f];
                if(f == arr.length-1) f = 0;
                else f++;
                size--;
                return val;
            }
        }

        int peek() throws Exception {
            if(size == 0) {
                throw new Exception("Queue is empty");
            }
            else return arr[f];
        }

        boolean isEmpty() {
            if(size == 0) return true;
            else return false;
        }

        void display() {
            if(size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            else if(r>=f) {
                for(int i = f; i <= r; i++) {
                    System.out.print(arr[i] +" ");
                }
            }
            else if(r < f) {
                for(int i = f; i <= arr.length-1; i++) {
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        CircularQueue q1 = new CircularQueue();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
        q1.remove();
        q1.display();
        q1.add(6);
        q1.display();
//        q1.add(7); 
        System.out.println(q1.peek());
        for(int i = 0; i < q1.arr.length; i++) {
            System.out.print(q1.arr[i]+" ");
        }
    }
}
