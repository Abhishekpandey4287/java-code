import java.util.ArrayList;

public class learnArraylist {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("prem");
        a.add("pooja");
        a.add("abhishek");
        System.out.println(a);

        //arraylist increase its size by n + n/2 +1
        //insertion
        ArrayList<String> Newa = new ArrayList<>();
        Newa.add("snehal");
        Newa.add("shweta");
        a.addAll(Newa);
        a.add(1 , " rahul");
        System.out.println(a);


        //deletion
        a.remove(0);
        System.out.println(a);
    }
}
