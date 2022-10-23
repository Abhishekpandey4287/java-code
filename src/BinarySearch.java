import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,3,4,5,6,7,8,9};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number you are searching");
        int target = in.nextInt();
        int ans = binarysearch(a, target);
        System.out.println("its in index = " + ans);
    }
    static int binarysearch( int[] arr , int target){
        int start = 0;
        int end = arr.length -1 ;
        while( start <= end ){
            int mid = start + (end -start)/2 ;
            if ( arr[mid] < target){
                start = mid + 1 ;
            } else if (target < arr[mid]) {
                end = mid -1 ;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
