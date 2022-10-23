import java.util.Arrays;
import java.util.Scanner;

public class rowcolmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(Arrays.toString(matrix(arr, target)));
    }
    static int[] matrix(int[][] matrix , int target ){
        int r = 0;
        int c = matrix.length -1 ;
        while (r < matrix.length && c > 0 ){
            if(matrix[r][c] == target ){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
