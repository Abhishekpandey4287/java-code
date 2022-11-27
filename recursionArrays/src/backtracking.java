import java.util.Arrays;

public class backtracking {
    public static void main(String[] args) {
        boolean[][] board ={
                {true, true , true},
                {true, true, true},
                {true , true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        backmaze("" , 0,0,board , path , 1);
    }
    static void backmaze(String p , int r , int c ,boolean[][] m , int[][] path , int steps ){
        if(r== m.length-1 && c == m[0].length-1){
            path[r][c] = steps;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!m[r][c]){
            return ;
        }
        m[r][c] = false;
        path[r][c] = steps;
        if(r<m.length-1){

            backmaze(p +"D",r+1,c, m, path , steps +1);
        }
        if(c<m[0].length-1){
            backmaze (p +"R" ,r, c+1, m, path , steps +1);

        }
        if(r>0){
            backmaze( p + "U",r-1, c , m , path , steps +1);
        }
        if(c>0){
            backmaze( p + "L" ,r, c-1 , m , path , steps +1);
        }
        m[r][c] = true;
        path[r][c] =0;
    }
}
