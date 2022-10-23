import java.util.Arrays;

public class changevalue {
    public static void main(String[] args){
        int[] arr = { 1,2,5,7,8,9};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=95;
    }

}
