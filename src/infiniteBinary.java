public class infiniteBinary {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,7,8,9,10,13,15,18,20,22,25,29,30,31,33,35,36,39,40 };
        int target = 18;
        System.out.println(ans(a,target));
    }
    static int ans(int[] a , int target){
        int start = 0 ;
        int end = 1;
        while(target > a[end]){
            int temp = end + 1 ;
            end = end + (end-start +1) *2;
            start = temp;
        }
        return binarySearch(a , target , start , end);
    }
    static int binarySearch(int[]a , int target , int start , int end ){
        while(start < end){
            int mid = start + (end-start)/2;
            if(target > a[mid]){
                start = mid +1;
            }
            else if(target < a[mid]){
                end = mid -1 ;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
