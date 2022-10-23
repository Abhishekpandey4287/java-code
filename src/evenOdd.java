import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to know it is odd (if it is true mean it is odd ) ");
        int a = in.nextInt();

        System.out.println(isodd(a));
    }

    private static boolean isodd(int a) {
        return (a & 1) == 1;
    }
}
