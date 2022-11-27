public class Sorted {
    public static void main(String[] args) {
     int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(sortornot(a , 0));
    }
    static boolean sortornot(int[] arr , int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]< arr[index+1] && sortornot(arr , index+1);
    }
}
