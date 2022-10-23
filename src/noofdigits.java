import java.util.Scanner;

public class noofdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the digit");
        int n = in.nextInt();
        int b = 2;
        int ans = (int) ( Math.log(n) / Math.log(b) ) + 1 ;

        System.out.println("no of digits is : " + ans);
    }
}
