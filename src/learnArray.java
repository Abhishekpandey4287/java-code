import java.util.Arrays;

public class learnArray {
    public static void main(String[] args) {
        int[] a  = {1,2,4,5,7,8,6,2,4};
        //Arrays.toStrings helps us to print the array
        System.out.println(Arrays.toString(a));
        //Arrays.sort helps us to sort the entire array
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

// O(n)   Big O of n
