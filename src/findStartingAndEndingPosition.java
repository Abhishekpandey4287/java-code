import java.util.Arrays;
import java.util.Scanner;

public class findStartingAndEndingPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 8, 9};
        System.out.println("enter the number you are searching:-");
        int target = in.nextInt();
        int[] ans = search(a, target);
        System.out.println(Arrays.toString(ans));
    }

    //lets do with the alternative method
    /*static int[] search(int[] a , int target){

        int[] ans = {-1 , -1};
        for(int i = 0; i < a.length; i++){
            if(a[i]== target){
             ans[0] = i;
             break;
            }
        }
        for(int j = a.length-1 ; j>0 ; j--){
            if(a[j]== target){
                ans[1] = j;
                break;
            }
        }
        return ans;
    }
}*/
    static int[] search(int[] a, int target) {
        int[] ans = {-1 , -1};
        ans[0] = index(a , target, true);
        ans[1]  = index(a , target, false);
        return ans ;
    }
    static int index(int[] a , int target , boolean findStartIndex){
        int ans = -1;
        int s = 0 ;
        int e = a.length-1;
        while (s <= e ){
            int mid = s + (e-s)/2;
            if(a[mid] > target){
                e = mid-1;
            }
            else if(a[mid] < target){
                s = mid+1 ;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    e = mid-1;
                }else {
                    s = mid+1;
                }
            }
        }
        return ans ;
    }

}

