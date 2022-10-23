public class opptoceilingofnumber {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int ans = array(a,2);
        System.out.println(ans);
    }
    static int array(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1 ;
        while( start <= end ){
            int mid = start + (end - start)/2;
            if( arr[mid] == target ){
                return mid ;
            }
            if( arr[mid] < target){
                start = mid + 1;
            }
            if ( arr[mid] > target ){
                end = mid - 1 ;
            }

        }
        return arr[end] ;
    }
}

