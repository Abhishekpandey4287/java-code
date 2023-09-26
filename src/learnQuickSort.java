import java.util.Arrays;

public class learnQuickSort {
    public static void main(String[] args) {
      int[] a  = {1,2,5,4,7,8,9,6,3,0};
      Sort(a , 0 , a.length-1);
      System.out.println(Arrays.toString(a));
    }
    static void Sort(int[] arr , int low , int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];
        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        Sort( arr, s , high);
        Sort( arr, low , e);
    }
}
