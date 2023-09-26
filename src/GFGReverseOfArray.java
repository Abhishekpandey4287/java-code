import java.util.Arrays;

//questions is to reverse the array using recursion
public class GFGReverseOfArray {
    /*public static void main(String[] args) {
        int n = 5;
        int[] a = { 5, 4, 3, 2, 1};
        reverseArray(a, 0, n - 1);
        System.out.println(Arrays.toString(a));
    }
    static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }*/


    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9};
        reverse(a , 0 , a.length - 1 );
        System.out.println(Arrays.toString(a));
    }
    static void reverse(int[] a , int start ,int end ){
        if(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            reverse(a , start+1 ,end-1);
        }
    }
}
