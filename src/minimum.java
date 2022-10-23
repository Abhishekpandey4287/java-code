public class minimum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int ans = min(a);
        System.out.println(ans);
    }
    static int min( int[] arr){
        int ans = arr[0];
        for ( int i = 0 ; i < arr.length ; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
