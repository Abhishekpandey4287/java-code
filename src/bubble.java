import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
       // int[] a = {1,5,2,3,6,4,7,8,9};
        int[] a = {1,2,3,4,5,6,7,8,9};
        bubbles(a);
        System.out.println(Arrays.toString(a));
    }
    static void bubbles(int[] arr){
        boolean swapped;
        for (int i = 0 ; i < arr.length ; i ++){
            swapped = false;
            for(int j= 1 ; j< arr.length -i ; j++){
                if(arr[j-1]> arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
