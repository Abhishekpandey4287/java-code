import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //find the largest number
        int max = a;
        if(max< b ){
            max = b;
        }
        if( c > max ){
            max = c;
        }
        System.out.println(max);

    }
        }
