import java.util.Scanner;

public class SearchInTwoDArray {
    public static void main(String[] args){
        int[][] a = {{2,3,1,4,5,1},{2,5,4,8,7,0}};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans = min( a, target);
        System.out.println(ans);
    }
    static int min(int[][] arr , int target ){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i< arr.length; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                int element = arr[i][j];
                if(element == target){
                    return arr[i][j] ;
                }
            }
        }return -1;
    }
}
