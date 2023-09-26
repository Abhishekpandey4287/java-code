import java.util.Scanner;

public class GfGNumberIsPrime {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        itsprimeornot(n);
    }

    private static void itsprimeornot(int n) {
        int count = 0;
        for ( int i = 1; i * i <= n; i++) {
            if (n % i == 0 && n != 1) {
                count++;
                if (n / i != 0) {
                    count++;
                }
            }
        }
        if(count == 2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
