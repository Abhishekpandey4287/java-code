import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] a = {4,2,5,6,3,1};
        sort(a, a.length-1 , 0);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int[] arr , int r , int c ){
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            sort(arr , r , c+1);
        }
        else{
            sort(arr, r-1 , 0);
        }

    }
}
