public class practice {
    public static void main(String[] args) {
       // System.out.println(steps("" ,3,3));
    steps1("" , 3,3);
    }

    static int  steps(String p , int r, int c )
    {
        if(r== 1 || c ==1){
            return 1;
        }
        int left = steps(p , r-1 , c);
        int right = steps(p , r , c-1);
        return left + right;
    }
    static int  steps1(String p , int r, int c )
    {
        if(r== 1 && c ==1){
            System.out.println(p);
            return 1;
        }
        if (r > 1) {
         steps1(p +"D" , r-1 , c);}
        if(c>1){
            steps1(p+ "R" , r , c-1);}

        return 1;
    }
}
