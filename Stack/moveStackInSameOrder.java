// Move elements of one Stack to another in same order.

import java.util.Stack;
import java.util.Scanner;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        //        Scanner sc = new Scanner(System.in);
        //        Stack<Integer> st = new Stack<>();
        //        System.out.println("Enter the number of elements :");
        //        int n = sc.nextInt();
        //        System.out.println("Enter the elements :");
        //        for(int i = 1; i <= n; i++) {   // Iterative way to push any element.
        //            int val = sc.nextInt();
        //            st.push(val);
        //        }
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println(st1);
        //reverse order
        Stack<Integer> st2 = new Stack<>();
        while(st1.size() > 0) {
            int x = st1.peek();  // Other way -> st2.push(st1.pop());
            st2.push(x);
            st1.pop();
        }
        System.out.println(st2);
        // same order
        Stack<Integer> st3 = new Stack<>();
        while(st2.size() > 0) {
            st3.push(st2.pop());
        }
        System.out.println(st3);     
    }
}
