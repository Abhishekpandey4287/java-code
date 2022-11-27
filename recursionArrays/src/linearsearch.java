public class linearsearch {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(linear(a, target, 0));
    }
    static boolean linear(int[] arr , int target , int index){
        if(index== arr.length){
            return false;
        }
        if(arr[index]== target){
            return true;
        }
        return linear(arr, target , index+1);
    }
}
