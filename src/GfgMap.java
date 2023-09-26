import java.util.HashMap;
import java.util.Map;

public class GfgMap {
    public static void main(String[] args) {
        /*int[] a = {1,2,3,4,5,1,2,3,2,4,5,};
        int n = a.length;
        fun(a , n );
    }
    static void fun(int[] arr , int n ){
        Map<Integer ,Integer> m = new HashMap<>();
        for(int i = 0 ; i< n ; i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i]) +1 );
            }
            else {
                m.put(arr[i] , 1);
            }
        }
        for(Map.Entry<Integer , Integer> entry : m.entrySet()){
            System.out.println(entry.getKey() +" " + entry.getValue());
        }
*/


      /*  int[] a = {1,2,5,4,2,5,8,7,4,5,2,5,4,1,2,5};
        int n = a.length;
        fun(a, n);
    }
    static void fun(int[] arr, int n ){
    Map<Integer, Integer> m = new HashMap<>();
    for(int i = 0 ; i < n ; i++){
        if(m.containsKey(arr[i])){
            m.put(arr[i] , m.get(arr[i])+1);
        }
        else {
            m.put(arr[i] , 1);
        }

    }
    for(Map.Entry<Integer, Integer> e : m.entrySet()){
        System.out.println(e.getKey() + " " + e.getValue());
    }
*/






















/*
        int[] a = {1,2,5,5,6,3,9,8,7,5,2,3,1,4,5,2,5,};
        int n = a.length;
        fun(a, n );


    }
    static void fun(int[] arr , int n ){
        Map<Integer , Integer> m = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i] , m.get(arr[i])+1);
            }
            else{
                m.put(arr[i] ,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }*/
    //}


    int[] a = {1, 2, 5, 4, 7, 8, 9, 6, 3, 5, 1, 2, 5, 4};
    int n = a.length;

    fun(a, n);
}
static void fun(int[]arr ,int n ) {
 Map<Integer, Integer> m = new HashMap<>();
 for(int i =0 ; i < n ; i++){
     if(m.containsKey(arr[i])){
         m.put(arr[i] , m.get(arr[i])+1);
     }
     else{
         m.put(arr[i] , 1);
     }
 }

 for(Map.Entry<Integer,Integer> e : m.entrySet()){
     System.out.println(e.getKey() + " " + e.getValue());
 }
}

}
