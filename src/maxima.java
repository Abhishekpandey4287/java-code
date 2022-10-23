public class maxima {
    public static void main(String[] args) {
        int[][] a = {{11,2,4,5,7,8},{2,3,5,6,8,9}};
        int ans = min(a);
        System.out.println(ans);
    }
    static int min(int[][] arr){
        int ans = arr[0][0];
        for( int i = 0 ; i< arr.length ; i ++){
            for ( int j = 0 ; j< arr.length ; j++){
                if(ans < arr[i][j]){
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }
}
