import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] a = {1,2,5,4,6,3,9,8,7};
        int n = a.length;
        fun(a, n);
        System.out.println(Arrays.toString(a));

    }
    static void fun(int[] arr , int n ){
        for(int i = 0 ; i <  n-2 ; i++){
            int min = i;
            for(int j = i ; j <= n-1 ; j++){
                if(arr[j] < arr[min]){
                    min = j ;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
