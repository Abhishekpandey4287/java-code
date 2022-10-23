import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] a = {1,3,2};
        search(a);
        System.out.println(Arrays.toString(a));
    }
    static void search(int[] arr){
        int i=0;
        while(i< arr.length){
            // if range is [1,n] use int correct = arr[i]-1 and if the range is from [0,n] use  int correct = arr[i]
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second ){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }

}
