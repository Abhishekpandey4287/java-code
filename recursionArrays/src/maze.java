import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
      // System.out.println(steps(3,3));
       // System.out.println(pathdiagonal2("" , 3,3));
        path("" , 3 ,3);
        System.out.println(pathdiagonal3("" , 0,0));
    }
    static int steps(int r , int c ){
        if(r==1 || c ==1){
            return 1;
        }
        int left = steps(r-1,c);
        int right = steps(r , c-1);
        return left + right;
    }
    static void path(String p , int r , int c ){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p +"D", r-1,c);
        }
        if(c>1){
            path(p +"R" , r, c-1);
        }
    }

    static void pathdiagonal(String p , int r , int c ){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            pathdiagonal(p +"D" , r-1 , c-1);
        }
        if(r>1){
            pathdiagonal(p +"V", r-1,c);
        }
        if(c>1){
            pathdiagonal(p +"H" , r, c-1);
        }
    }
    static ArrayList<String> pathdiagonal2(String p , int r , int c ){
        if(r==1 && c==1){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> list = new ArrayList<>() ;

        if(r>1 && c>1){
           list.addAll(pathdiagonal2(p +"D" , r-1 , c-1));
        }
        if(r>1){
           list.addAll( pathdiagonal2(p +"V", r-1,c));
        }
        if(c>1){
            list.addAll(pathdiagonal2(p +"H" , r, c-1));
        }
        return list;
    }
    static ArrayList<String> pathdiagonal3(String p , int r , int c ){
        if(r==2 && c==2){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>() ;

       if(r<2){
            list.addAll( pathdiagonal3(p +"V", r+1,c));
        }
        if(c<2){
            list.addAll(pathdiagonal3(p +"H" , r, c+1));
        }
        return list;
    }

}
