import java.util.ArrayList;

public class mazeWithRestrication {
    public static void main(String[] args) {
       boolean[][] board ={
               {true, true , false},
               {true, true, true},
               {false , true, true}
       };
        pathdiagonal3("" , board , 0,0);
        System.out.println(pathdiagonal("" , board , 0,0));
    }

    static void pathdiagonal3(String p ,boolean[][] maze, int r , int c ){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        if(r<2){
            pathdiagonal3(p +"V", maze ,r+1,c);
        }
        if(c<2){
           pathdiagonal3(p +"H" , maze,r, c+1);
        }
    }
    static ArrayList<String> pathdiagonal(String p , boolean[][] maze, int r , int c ){
        if(r==maze.length-1 && c==maze[0].length-1){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(!maze[r][c]) {
            return list;
        }
        if(r<2){
            list.addAll(pathdiagonal(p +"V", maze ,r+1,c));
        }
        if(c<2){
           list.addAll( pathdiagonal(p +"H" , maze,r, c+1));
        }
        return list;
    }

}
