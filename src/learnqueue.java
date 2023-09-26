import java.util.LinkedList;
import java.util.Queue;

public class learnqueue {
    public static void main(String[] args) {
        Queue<String> pooja = new LinkedList<>();
        //it is based on FIFO method which mean first in first out
        //insert
        pooja.offer("apple");
        pooja.offer("box");
        pooja.offer("cat");
        pooja.offer("dog");
        System.out.println(pooja);
        System.out.println(pooja.peek());

        //deletion
        pooja.poll();
        System.out.println(pooja);

        System.out.println(pooja.remove());
        System.out.println(pooja);

        //observe
        System.out.println(pooja.peek());
        pooja.poll();
        pooja.poll();
        System.out.println(pooja);

    }
}
