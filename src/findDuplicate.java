public class findDuplicate {
    public static void main(String[] args) {
        int[] a = {1,2,4,3,5,6,2,7};
        search(a);
        System.out.println(a);
    }
    static int search(int[] arr){
        int i = 0;
        while( i < arr.length){
            if(arr[i] != i+1) {
                int correct = arr[i] - 1;
                if (arr[i] != correct) {
                    swap(arr, i, correct);

                } else {
                    return arr[i];
                }
            }
            else  i++;
        }
        return -1;
    }
    static void swap(int[] arr, int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
