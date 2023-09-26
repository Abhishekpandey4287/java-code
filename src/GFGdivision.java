public class GFGdivision {
    public static void main(String[] args) {
        int n = 4;
        System.out.println( "sum of divisor is "+ sumOfDivisors(n));

    }
    static long sumOfDivisors(int N){
        // code here
        long a = 0 ;
        for(int i = 1 ; i <= N; i++){
            a = a + N/i * i;
            System.out.println(a );
        }
        return a ;
    }

}


