public class gfgSumOfNumber {
    public static void main(String[] args) {
        int n = 1342;
        number(n);
    }

    private static void number(int n) {
        int degit ;
        int cpy = n ;
        int sum = 0 ;
        for(int i = 1 ;  i < cpy ;i++){
        if(n > 0){
            degit = n % 10 ;
            sum = sum + degit;
            n = n/10;
        }
        }
        System.out.println(sum);
    }
}
