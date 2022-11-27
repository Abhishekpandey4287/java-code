import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] a = {1, 5, 9, 7, 5, 3, 8, 6, 2};
        sort(a, a.length, 0, 0);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] arr, int r, int c, int m) {
        if (r == 0) {
            return;
        }
        if (r>c){
            if(arr[c]>=arr[m]){
                sort(arr, r, c+1 , c);
            }
            else {
                sort(arr, r,c+1 , m);
            }
        }
        else{
            int temp = arr[m];
            arr[m] = arr[r-1];
            arr[r-1] = temp;
            sort(arr, r-1 , 0 ,0);
        }
    }
}


