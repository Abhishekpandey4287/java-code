import java.util.Arrays;

public class array {
    public static void main(String[] args) {
            int[][] a = {3,2,4};
            int target = 6;
            int ans = abhi(a, target);
            System.out.println(ans);
        }
        static int abhi(int[][] arr, int target){
           // int sum = 0;
            for (int i = 0 ; i < arr.length ; i++ ){
                for(int j =0 ; j < arr[i].length ; j++){
                    if( arr[i] + arr[j]== target ){
                        return arr[i][j];
                    }
                //System.out.println(Arrays.toString(arr[i]));
                /*sum = sum + arr[i];
                if (sum == target ){
                 return sum;

                 */
                }
            }
            return arr;
        }
}
