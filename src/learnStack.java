import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        //Last in first out LIFO
        //insertion
        s.push(2);
        s.push(3);
        s.push(1);
        s.push(7);
        s.push(13);
        System.out.println(s);

        //pop
        s.pop();
        System.out.println(s);

        //peek
        System.out.println(s.peek());
    }
}
