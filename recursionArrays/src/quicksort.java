import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] n = {1,5,8,9,7,4,6,3,2};
        quick(n , 0, n.length-1);
        System.out.println(Arrays.toString(n));
    }

    static void quick(int[] arr, int low , int high ){
        if(low >= high){
            return ;
        }
        int s = low ;
        int e = high;
        int mid = s +(e-s)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s]< pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp ;
                s++;
                e--;
            }
        }
        quick(arr, low , e);
        quick(arr, s, high);
    }
}
