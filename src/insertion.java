import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] a = {1,2,45,4,8,5,41,2,6,3,9,8};
        insert(a);
        System.out.println(Arrays.toString(a));
    }
    static void insert(int[] a){
        for(int i= 0 ; i < a.length -1 ; i++){
            for(int j = i+1 ; j > 0 ; j--){
                if(a[j]< a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

}
