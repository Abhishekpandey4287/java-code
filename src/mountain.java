public class mountain {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,4,3,2,1};
        int target = 5;
        int ans = mount( arr ,target );
        System.out.println("index of the largest number is = " + ans);
        }
    static int mount(int[] arr , int target ){
        int start = 0 ;
        int end = arr.length-1;
        while(start <= end){
            int mid = start +(end - start)/2 ;
            if(arr[mid] > arr[mid+1]){
                end = mid ;
            }
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            if( arr[mid]== target){
                return mid;
            }
        }
        return end;
    }
}

