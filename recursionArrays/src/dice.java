import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        System.out.println(number1("" , 5));
        System.out.println(number2("" , 5));
    }
    static void number(String p , int target){
        if(target == 0){
            System.out.println(p);
            return ;
        }
        for(int i = 1 ; i <= 6 && i<= target ; i++){
            number(p+i , target-i);
        }
    }

    static ArrayList<String> number1(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1 ; i <= 6 && i<= target ; i++){
            list.addAll(number1(p+i , target-i));
        }
        return list;
    }

    static int number2(String p , int target){
        if(target == 0){
            return 1;
        }
        int count = 0;
        for(int i = 1 ; i <= 6 && i<= target ; i++){
           count = count +(number2(p+i , target-i));
        }
        return count;
    }


}
