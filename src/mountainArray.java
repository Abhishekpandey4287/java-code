public class mountainArray {
    public static void main(String[] args) {
        int[] a = {0,10,11,15,12,1,2};
        System.out.println(peakSearch(a));
    }
    static int peakSearch(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid ;
            }
            else{
                start = mid + 1;
            }

        }
        return start;
    }
}
