public class searchMountainArray {
    public static void main(String[] args) {
        int[] a ={0,1,2,3,4,3,2,1,0};
        int target = 4;
        System.out.println(search(a , target));
    }
    static int search(int[] arr , int target){
        int peak = peak(arr);
        int firstTry = mountainArray(arr, target, 0 ,peak);
        if(firstTry != -1) {
            return firstTry;
        }
        return mountainArray(arr, target, peak+1, arr.length-1);
    }
    static int peak(int[] arr){
        int start = 0 ;
        int end = arr.length-1 ;
        while(start < end ){
            int mid = start +(end -start) /2;
            if(arr[mid]< arr[mid+1]){
                start = mid +1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    static int mountainArray(int[] a , int target ,int start , int end ){
     boolean asc = a[start] < a[end];
      while (start <= end ){
          int mid = start + (end -start)/2;
          if(target == a[mid]){
              return mid;
          }
          if(asc ){
              if(target > a[mid]){
                  start = mid +1;
              }
              else {
                  end = mid -1;
              }
          }else {
              if(target < a[mid]){
                  start = mid +1 ;
              }else {
                  end = mid -1;
              }
          }
      }
      return -1;
    }
}
