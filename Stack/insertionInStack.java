import java.util.Stack;

public class insertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println(st1);
        int idx = 2;
        int x = 6;

        Stack<Integer> st2 = new Stack<>();
        while(st1.size() > idx) {
            st2.push(st1.pop());
        }
        st1.push(x);
        while(st2.size() > 0) {
            st1.push(st2.pop());
        }
        System.out.println(st1);
    }
    
}
