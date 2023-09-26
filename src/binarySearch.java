import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("enter the number you are searching:-");
        int target = in.nextInt();
        System.out.println( search(a , target));
    }
    static int search(int[] a , int target){
        int s = 0 ;
        int e = a.length-1;
        while(s<= e ){
            int mid = s+(e-s)/2;
            if(target < a[mid]){
                e = mid -1 ;
            } else if (target > a[mid]) {
                s = mid +1;
            }else{
                return mid;
            }
        }
        return a[s% a.length]; // if we want to return the number which is greater
    }
}
