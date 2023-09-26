package learnArray;
import java.util.Arrays;

public class LearnSecondLargestArray {
    public static void main(String[] args) {
        int[] a= {1,4,5,2,3,6,9,8,7,7};
        int[] ans = Solution(a);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Solution(int[] a){
        int SecondLargest = SLargest(a) ;
        int SecondSmallest = SSmallest(a);
        return new int[]{SecondLargest , SecondSmallest};
    }
    static int SLargest(int[] arr){
        int largest = arr[0];
        int Second_largest = Integer.MIN_VALUE;
        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                Second_largest = largest;
                largest = arr[i];
            } else if (arr[i] <= largest && arr[i] > Second_largest) {
                Second_largest = arr[i];
            }
        }
        return Second_largest;
    }
    static int SSmallest(int[] arr){
        int Smallest = arr[0];
        int Second_Smallest = Integer.MAX_VALUE;
        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] < Smallest){
                Second_Smallest = Smallest;
                Smallest = arr[i];
            } else if (arr[i] != Smallest && arr[i] < Second_Smallest) {
                Second_Smallest = arr[i];
            }
            }
        return Second_Smallest;
        }
}
