import java.util.Scanner;

public class orderagnostic {
    public static void main(String[] args) {
        int[] a = {9,8,7,4,5,6,1,2,3};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number you are searching");
        int target = in.nextInt();
        int ans = binarysearch(a, target);
        System.out.println("its in index = " + ans);
    }
    static int binarysearch( int[] arr , int target){
        int start = 0;
        int end = arr.length -1 ;
        boolean isAsc = arr[start]<arr[end];
        while( start <= end ){
            int mid = start + (end -start)/2 ;
            if(arr[mid]== target){
                return mid;
            }
            if(isAsc) {
                if ( arr[mid] < target){
                    start = mid + 1 ;
                } else if (target < arr[mid]) {
                    end = mid -1 ;
                }
            else {
                    if ( arr[mid] > target){
                        start = mid + 1 ;
                    } else if (target > arr[mid]) {
                        end = mid -1 ;
                    }
                }
            }
        }
        return -1;
    }
}


