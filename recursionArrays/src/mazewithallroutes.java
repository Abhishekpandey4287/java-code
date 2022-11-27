import java.util.ArrayList;

public class mazewithallroutes {
    public static void main(String[] args) {
        boolean[][] board ={
                {true, true , true},
                {true, true, true},
                {true , true, true}
        };
        maze("" , 0,0,board);
    }
    static void maze(String p , int r , int c ,boolean[][] m ){
        if(r== m.length-1 && c == m[0].length-1){
            System.out.println(p);
            return;
        }
        if(!m[r][c]){
            return ;
        }
        m[r][c] = false;
        if(r<2){

            maze(p +"V",r+1,c, m);
        }
        if(c<2){
           maze(p +"H" ,r, c+1, m);
        }
        if(r>0){
            maze( p + "U",r-1, c , m );
        }
        if(c>0){
            maze( p + "L" ,r, c-1 , m );
        }
        m[r][c] = true;

    }
    static ArrayList<String> maze1(String p , int r , int c , boolean[][] m ){
        if(r== m.length-1 && c == m[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(!m[r][c]){
            return list;
        }
        m[r][c] = false;
        if(r<2){
            list.addAll(maze1(p +"V",r+1,c, m));
        }
        if(c<2){
            list.addAll(maze1(p +"H" ,r, c+1, m));
        }
        if(r>0){
            list.addAll(maze1( p + "U",r-1, c , m ));
        }
        if(c>0){
            list.addAll( maze1( p + "L" ,r, c-1 , m ));
        }
        m[r][c] = true;
        return list;
    }
}
