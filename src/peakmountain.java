public class peakmountain {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,3,1};
        int target = 3;
      // System.out.println(Search(a,target));
       System.out.println(peakindexinmountain(a));
       // System.out.println(binarysearch(a,target,0,a.length-1));

    }
    static int Search(int[] arr , int target){
        int peak = peakindexinmountain(arr);
        int firsttry = binarysearch(arr ,target,0,peak);
        if(firsttry != -1){
            return firsttry;
        }
        return binarysearch(arr,target,peak+1, arr.length-1);
    }
    static int peakindexinmountain(int[] arr) {
        int start = 0;
        int end = arr.length -1 ;
        while(start< end ){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int binarysearch( int[] arr , int target , int start ,int end ){

        boolean isAsc = arr[start] < arr[end];

        while( start <= end ){
            int mid = start + (end -start)/2 ;
            if(arr[mid]== target){
                return mid;
            }
            if(isAsc) {
                if ( arr[mid] < target){
                    start = mid + 1 ;
                } else if (target < arr[mid]) {
                    end = mid -1 ;
                }
                else {
                    if ( arr[mid] > target){
                        start = mid + 1 ;
                    } else if (target > arr[mid]) {
                        end = mid -1 ;
                    }
                }
            }
        }
        return -1;
    }
}
