import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        /*person p1 = new person();
        p1.age = 22 ;
        p1.name = "abhishek";
        p1.salary = 250000f;
        System.out.println(p1.age + " " + p1.salary + " " + p1.name);
        p1.walk();*/

       /* Scanner in = new Scanner(System.in);
        int food = in.nextInt();*/
        person p2 = new person();
        p2.age = 22;    p2.salary = 30000f;
        System.out.println(p2.age + " " + p2.salary +" " + p2.name);
        p2.walk();
        p2.name = "pooja" ;
        p2.eat(4);
        System.out.println(person.count);


        person p3 = new person();
        p3.age = 22 ;
        p3.name = "prem";
        p3.salary = 250000f;
        System.out.println(p3.age + " " + p3.salary + " " + p3.name);
        p3.walk(2);

    }
}
/*class Developer extends person{
    public Developer(int age , String name ){
        super(age , name);
    }*/

class  person{
    int age;
    float salary;
    String name ;

    static int count;
    //function or methods
     public person(){
        System.out.println(" creating an object ");
        count++;
    }

  /*  public person(int age , String name ){
         this.age = age ;
         this.name = name ;
    }*/

    void walk(){
        System.out.println(name + " "+" is walking ");
    }
    void eat(){
        System.out.println(name + " " +" is eating ");
    }
    void eat(int food ){
        System.out.println(name + " " + " is eating " + food + " puri at a time ");
    }
    void walk(int steps){
        System.out.println(name + " " + " is walking "+ steps + " steps/min ");
    }

    void sleep(){
        System.out.println("sleep");
    }

}




// polymorfism same name but different meaning / work