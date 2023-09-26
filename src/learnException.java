public class learnException {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,7,8};
        for (int i = 0 ; i<= a.length ; i++ ){
           // System.out.println(a[i]);
            try {
                System.out.print(a[i] + " ");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("pooja yaar error hai yaha per");
            }
        }
        System.out.println("hello pooja its me abhishek");
    }
}

// Scanner , Array , linked list , QUEUE   ,Stack , Arraylist , List , PriorityQueue , Dequeue , HashMaps , Maps