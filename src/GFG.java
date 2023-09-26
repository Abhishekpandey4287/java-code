import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            Geeks obj = new Geeks();
            obj.isPrime(n);
        }
    }
}

class Geeks {
    static void isPrime(int n) {
        if(n<= 1){
            System.out.println("No");
            return ;
        }
        else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if( n % i == 0){
                    System.out.println("No");
                    return ;
                }
            }
        }
        System.out.println("Yes");
    }
}