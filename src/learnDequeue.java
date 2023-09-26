import java.util.Deque;
import java.util.LinkedList;

public class learnDequeue {
    public static void main(String[] args) {
        Deque<Integer> a = new LinkedList<>();
        //insert
        a.offer(1);
        a.offer(2);
        a.offer(3);
        a.offer(4);
        a.offer(5);
        System.out.println(a);

        //insert
        a.offerFirst(0);
        System.out.println(a);
        a.offerLast(15);
        System.out.println(a);

        // deletion
        a.poll();
        System.out.println(a);
        a.pollFirst();
        System.out.println(a);
        a.pollLast();
        System.out.println(a);

        //peek
        System.out.println(a.peek());
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());
    }
}