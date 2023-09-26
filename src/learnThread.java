public class learnThread {
    public static void main(String[] args) {
        loop l = new loop();
        l.start();

        for (int i = 0 ; i < 5 ; i++){
            System.out.println("running the main thread");
        }
    }
}
class loop extends Thread{
     public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("running the child thread");
        }
    }
}
