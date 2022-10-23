public class maximumWealth {
    public static void main(String[] args) {
        int[][] wealth = {{1,5,9},{2,5,7},{9,9,2}};
        int ans =maximumwealth(wealth);
        System.out.println(ans);
    }
    static int maximumwealth(int[][] arr){
        int min = 0;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > min) {
                min = sum;
            }
        }
        return min;
    }
}
