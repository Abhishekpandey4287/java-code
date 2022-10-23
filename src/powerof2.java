import java.util.Scanner;
public class powerof2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the digit");
        int n = in.nextInt();
        boolean ans = (n & (n-1)) == 0 ;;
        System.out.println(ans);
    }
}
