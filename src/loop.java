import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // question print 1 to 5 number  , using for loop , while loop , do while loop
        //using for loop
        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for ( int num = 1 ; num <= n ; num++)
        {
            System.out.println(num);
        }*/
        // using while loop
        /*int num=1;
        while( num<=5)
        {
            System.out.println(num);
            num++;
        }*/
        // using do while loop
        int num =1;
        do
        {
            System.out.println(num);
            num++;
        }while(num<=5);
    }
}
