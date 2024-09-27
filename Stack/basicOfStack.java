import java.util.Stack;

public class basicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5); // push() function is use for add any element top of the Stack.
        st.push(9);
        st.push(7);
        st.push(2);
        st.push(5);
        st.push(8);
        st.push(6);
        System.out.println(st); // [5,9,7,2,5,8,6]
        System.out.println("The size of the Stack is : " + st.size());  // size() function is use for ditermine size of the Stack.
        st.pop();  // pop() function is used for remove or delete any element from top of the Stack.
        System.out.println(st); // [5,9,7,2,5,8]
        System.out.println(st.peek()); // 8 , peek() function is use for access the top element of Stack.

        //Print Stack first element.

        while(st.size() > 1) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);

    }
}