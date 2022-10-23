public class uniqueNumber {
    public static void main(String[] args) {
        int[] a = {1,5,9,5,1,9,7};
        System.out.println(ans(a));
    }
    private static int ans(int[] arr){
        int unique = 0;
        for( int n : arr)
        {
            unique ^= n;
        }
        return unique;
    }
}
