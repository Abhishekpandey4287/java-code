import java.util.Arrays;
public class mergeSort {
    public static void main(String[] args) {
        int[] a = {1,2,5,4,7,8,9};
        a= MergeSort(a);
        System.out.println(Arrays.toString(a));
    }
    static int[] MergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;
        int[] left = MergeSort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr , mid , arr.length));
        return merge( left , right);
    }
    static int[] merge(int[] left , int[] right ){
        int[] arr = new int[left.length + right.length];
        int i = 0 ;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
          if(left[i] < right[j]){
              arr[k] = left[i];
              i++;
          }
          else {
              arr[k] = right[j];
              j++;
          }
          k++;
        }
        while (i< left.length) {
                arr[k] = left[i];
                i++;
                k++;

        }
        while (j < right.length) {
                arr[k] = right[j];
                j++;
                k++;

        }

        return  arr;
    }
}


 /*   public static void main(String[] args) {
        int[] a = {1,2,5,4,7,8,9};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }
    static  int[] Sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = Sort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = Sort(Arrays.copyOfRange(arr , mid , arr.length-1));
        return Merge( left , right);
    }
    static  int[] Merge(int[] left , int [] right) {
        int[] arr = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;

        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;

        }

        return arr;
    }

}
*/