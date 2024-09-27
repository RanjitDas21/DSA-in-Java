import java.util.Stack;

public class displayStack {
    public static void printReverseRec(Stack<Integer> st) {
        if(st.size() == 0) return;

        int top = st.pop();
        System.out.print(top+" ");
        printReverseRec(st);
        st.push(top);
    }
    public static void printRec(Stack<Integer> st) {
        if(st.size() == 0) return;

        int top = st.pop();
        printRec(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //using other Stack

        Stack<Integer> temp = new Stack<>();
        while(st.size() > 0) {
            temp.push(st.pop());
        }
        while(temp.size() > 0) {
            int x = temp.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
        System.out.println(st);

        //using Array

        int n = st.size();
        int arr[] = new int[n];
        for(int i = n-1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
        System.out.println();
        System.out.println(st);

        printRec(st);
        System.out.println();
        printReverseRec(st);
        System.out.println();
        System.out.println(st);

    }
    
}
