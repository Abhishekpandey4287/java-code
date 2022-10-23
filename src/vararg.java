import java.util.Arrays;

// variable length arguement
public class vararg {
    public static void main(String[] args){
        multiple();

    }

    static void multiple ( int...v)
    {
        System.out.println(Arrays.toString(v));
    }

}
