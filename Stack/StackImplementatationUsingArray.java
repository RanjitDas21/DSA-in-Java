public class StackImplementatationUsingArray {

    public static class ArrayStack {
        private int arr[] = new int[5];
        private int idx = 0;

        void push(int val) {
            if(isFull()) {
                System.out.println("Stack is full!");
                System.out.println("You can not add any element.");
                return;
            }
            arr[idx] = val;
            idx++;
        }

        int pop() {
            if(isEmpty()) {
                System.out.println("Stack is Empty!");
                System.out.println("You can not delete any element.");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        int peek() {
            if(isEmpty()) {
                System.out.println("Stack is Empty!");
                System.out.println("You can not access any element.");
                return -1;
            }
            return arr[idx-1];
        }

        boolean isEmpty() {
            if(idx == 0) return true;
            else return false;
        }

        boolean isFull() {
            if(idx == arr.length) return true;
            else return false;
        }

        void display() {
            for(int i = 0; i < idx; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }
        int capacity() {
            return arr.length;
        }
    }
    public static void main(String[] args) {
        ArrayStack st = new ArrayStack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.push(8);
        st.push(11);
        st.display();
        System.out.println(st.isFull());
        st.push(21);
        st.display();
        st.push(11);
    }
}