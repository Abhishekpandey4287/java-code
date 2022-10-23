import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        // question :- reverse of the number you entered
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        int answer = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            answer = answer * 10 + rem;
        }
        System.out.println(answer);
    }
}
