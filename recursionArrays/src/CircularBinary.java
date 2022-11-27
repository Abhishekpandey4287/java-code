public class CircularBinary {
    public static void main(String[] args) {
        int[] a = {5,6,7,8,9,1,2,3};
        System.out.println(search( a , 9 , 0, a.length-1 ));

    }
    static int search(int[] arr , int target , int s , int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m]== target){
            return m ;
        }
        if(arr[s]<= arr[m]){
            if(target <= arr[m] && target >= arr[s]){
                return search(arr, target , s , m-1);
            }
            else{
                return search(arr, target , m+1 , e);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return search(arr, target , m+1, e);
        }
        return search(arr, target , s , m-1);
    }
}
