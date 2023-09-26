package pack;

public class learnAbstract {
    public static void main(String[] args) {
    people p = new people();
    p.building();
    p.villa();
    // this house class cann't be instantiated because the house is in abstract class and it will give us run-time error
   /* house h = new house();
    h.building();
    h.villa();*/
    }
}
abstract class house{
    abstract void building();
    abstract void villa();
}
class people extends house{
    public void building() {
        System.out.println("live in the building ");
    }
    public void villa(){
        System.out.println("live in the villa ");
    }

}


