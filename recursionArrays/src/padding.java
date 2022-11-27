import java.util.ArrayList;

public class padding {
    public static void main (String[] args){
        System.out.println(pad1("", "12"));
        gad("", "12");
        pad("" , "15");
    }
    static void pad(String p , String up ){
        if(up.isEmpty()){
            System.out.print(" "+ p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i = (digit -1)*3 ; i < digit * 3 ; i++ ){
            char ch = (char) ('a'+i);
            pad(p + ch  , up.substring(1));
        }
    }

    static ArrayList<String> pad1(String p , String up ){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for(int i = (digit -1)*3 ; i < digit * 3 ; i++ ){
            char ch = (char) ('a'+i);
            list.addAll(pad1(p + ch  , up.substring(1)));
        }
        return list;
    }

    static void gad(String p , String up ){
        if(up.isEmpty()){
            System.out.println(p );
            return;
        }
        int digit  = up.charAt(0) - '0';
        for(int i = (digit-1) * 3 ; i< digit*3 ; i++){
            char ch = (char)('a' + i);
            gad(p+ch , up.substring(1));
        }
    }
}
