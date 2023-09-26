import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Digit(a);
    }
    public static void Digit(int a) {
        int cpy = a;
        int sum = 0;
        int count = 0;
        boolean loop = false;
        for (int i = 1; i < cpy; i++) {
            if (a > 0 || !loop) {
                int rem = a % 10;
                sum = sum + rem;
                a = a / 10;
                count = count + 1;
                loop = true;
            } else {
                break;
            }
        }
        System.out.println(sum);
        System.out.println("digit count = " + " " + count);
    }
}
  /* public static void Digit(int a ) {
       int cpy = a;
       int count =0 ;
       boolean loop = false ;
       for (int i = 1; i < cpy; i++) {
           if (a > 0 || !loop) {
               a = a / 10;
               count = count +1 ;
               loop = true;
           }
           else{
               break;
           }
       }
       System.out.println("digit count = " + " "+count);
   }
}
*/