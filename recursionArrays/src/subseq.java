import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        substr("" , "abc");
        //System.out.println(substringret("" , "abc"));
    }

    static void substring(String p , String up) {
        if (up.isEmpty()) {
            System.out.println(" " + p);
            return;
        }
        char ch = up.charAt(0);

        substring(p + ch, up.substring(1));
        substring(p, up.substring(1));
    }

    static ArrayList<String> substringret(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left  = substringret(p + ch , up.substring(1));
        ArrayList<String> right = substringret(p , up.substring(1));

        left.addAll(right);
        return left;
    }

    static void substr(String p , String up) {
        if (up.isEmpty()) {
            System.out.println(" " + p);
            return;
        }
        char ch = up.charAt(0) ;
        substr(p + ch, up.substring(1));
        substr(p, up.substring(1));
        substr(p + (ch+0)  , up.substring(1));
    }
}
