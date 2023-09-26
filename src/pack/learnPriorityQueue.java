import java.util.Comparator;
import java.util.PriorityQueue;

public class learnPriorityQueue {
    public static void main(String[] args) {
        //PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> a = new PriorityQueue<>(Comparator.reverseOrder());
        //insertion
        a.offer(1);
        a.offer(3);
        a.offer(0);
        a.offer(20);
        System.out.println(a);
        //deletion
        a.poll();
        System.out.println(a);
        //peek
        System.out.println(a.peek());
    }
}
