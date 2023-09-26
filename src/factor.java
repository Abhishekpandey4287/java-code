import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ans = fibo(a);
        System.out.println(ans);
    }
    public static int factorial(int a ){
        if(a == 1 ){
            return 1;
        }
        return a * factorial(a-1);
    }
    public static int fibo(int a ){
        if(a <= 1 ){
            return 1;
        }
        return fibo(a-2)+fibo(a-1);
    }
}
