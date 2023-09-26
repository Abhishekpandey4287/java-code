public class Cars {
    public static void main(String[] args) {
        car ferrari = new car();
        ferrari.colour = "black";
        ferrari.wheels = 4;
        ferrari.age = 2022;
        System.out.println(ferrari.colour +" " + ferrari.wheels + " " + ferrari.age);
    }
}
class car{
    String colour ;
    int wheels;
    int age;
}