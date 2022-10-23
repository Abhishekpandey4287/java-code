import java.util.Scanner;

public class conditional {
    public static void main(String[] args)
    {
        //count number 5 in the entered number
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        int count = 0;
        while (n>0)
        {
            int rem = n%10;
            if(rem == 5)
            {
                count++;
            }
            n = n/10;

        }
        System.out.println(count);
    }
}
