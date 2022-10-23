import java.util.Scanner;

public class function {
    public static void main(String[] args){
        System.out.println("enter the number ");
        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = n1 + n2 ;
        System.out.println("sum of the number = "+ sum);
    }
}
