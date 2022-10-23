public class overloading {
    public static void main(String[] args){
        fun(12);
        fun(1.2546f);
        fun("prem");
    }
    static void fun(int a ){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(float f){
        System.out.println(f);
    }
}
