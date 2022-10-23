import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;
        while( true )
        {
            System.out.println("enter the operator(+-*/%) or to exit enter (x or X)");
            char op = in.next().trim().charAt(0);
            if( op == '*' || op == '+' || op == '-' || op == '/' || op == '%' ){
            System.out.println("enter the two number");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;
            }
            if (op == '*'){
                ans = num1 * num2;
            }
            if (op == '/'){
                ans = num1 / num2;
            }
            if (op == '%'){
                ans = num1 % num2;
            }
            }
            else if(op == 'x' || op == 'X' ){
                break;
            }
            else {
                System.out.println("you have entered the invalid operator");
              }
            System.out.println(ans);
        }
    }
}
