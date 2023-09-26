import java.util.Scanner;

public class findNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {1,2,3,4,5,5,5,6,7,8,8,9,9};
        System.out.println("enter the number you are searching:-");
        int target = in.nextInt();
        search(a , target);
    }
    static void search(int[] a , int target){
        int i ;
        int count = 0;
        for(i = 0 ; i <= a.length-1 ; i++){
            if(a[i]==target){
                System.out.println("it is at the index :- "+ i );
                count = count +1 ;
            }
        }
        System.out.println(target +" came in this array is :- " + count + " times");
    }
}
