public class searchCyclicBinary {
    public static void main(String[] args) {
       // int[] a ={3,4,5,6,7,0,1,2};
        int[] a = {1,3};
        int target = 0;
        System.out.println(search(a , target));
    }
    static int search(int[] arr , int target){
        int pivot = peak(arr);
        int firstTry = cyclicBinary(arr, target, 0 ,pivot);
        if(firstTry != -1) {
            return firstTry;
        }
        return cyclicBinary(arr, target, pivot+1, arr.length-1);
    }
    static int peak(int[] arr){
        /*int start = 0 ;
        int end = arr.length-1 ;
        while(start < end ){
            int mid = start + ( end - start ) / 2;
           if(mid < end && arr[mid] > arr[mid +1 ] ){
                return mid;

           }
            if( mid > start && arr[mid] < arr[mid - 1]){
               return mid -1;

           }
           if(arr[mid ] <= arr[start]){
               end = mid -1;
           }else {
               start = mid+1;
           }
        }
        return -1;*/

        // alternative method we can use but it will give us the n time complexity so use the above method only 
        int start = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[start] < arr[i]){
                 start = i;
            }else{
                return start;
            }
        }
        return -1;
    }
    static int cyclicBinary(int[] a , int target , int start , int end ){

      while (start <= end ){
          int mid = start + ( end - start ) / 2;
          if(target == a[mid]){
              return mid;
          }

              else if(target > a[mid]){
                  start = mid +1;
              }
              else {
                  end = mid -1;
              }
          }
      return -1;
    }
}
