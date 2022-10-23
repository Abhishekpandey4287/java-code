public class infinitebinarysearch {
    public static void main(String[] args) {
      int[] arr ={1,3,5,7,9,11,13,15};
      int target = 15;
      System.out.println(ans(arr , target));
    }
    static int ans(int[] arr , int target){
        int s = 0;
        int e = 1;
        while(target>arr[e]){
            int News = e +1 ;
            e = e +(e-s +1)*2;
            s = News;
        }
       return binarysearch(arr, target,s , e );
    }

    static int binarysearch( int[] arr  , int target , int start , int end ) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if( target == arr[mid]){
                return mid;
            }
            if( target > arr[mid]){
                start = mid +1 ;
            }
            if(target < arr[mid]){
                end = mid - 1 ;
            }
        }
        return -1;
    }
}
