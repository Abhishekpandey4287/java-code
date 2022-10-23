import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 15, 18, 19};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the target element ");
        int target = in.nextInt();
        int answer = linearsearch(num, target);
        System.out.println(answer);
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index <= arr.length; index++)
        {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
       return -1;
    }
}
