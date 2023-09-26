import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class learnSet {

    public static void main(String[] args) {
        //Set<Integer> a = new HashSet<>();    //prints in random order
        //Set<Integer> a = new LinkedHashSet<>();    //prints based on input order
        Set<Integer> a = new TreeSet<>();     //prints based on sorted order

        a.add(10);
        a.add(20);
        a.add(40);
        a.add(30);

        System.out.println(a);
        a.add(30);
        System.out.println(a);

        a.remove(40);
        System.out.println(a);
    }
}

// Integer Float Char Boolean Double  // String