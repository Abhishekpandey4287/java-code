import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(55);
        list.add(59);
        System.out.println(list.contains(55));
        System.out.println(list.contains(5555));
        System.out.println(list);
    }
}
