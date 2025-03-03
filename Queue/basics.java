import java.util.LinkedList;
import java.util.Queue;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(1);
        q.add(8);
        q.add(4);
        q.add(7);
        System.out.println(q);
        System.out.println("The size od the queue is :"+q.size());
        q.remove(); // q.poll();
        System.out.println(q);
        System.out.println(q.peek()); // q.element();
    }
}
