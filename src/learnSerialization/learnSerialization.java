package learnSerialization;

import java.io.*;

public class learnSerialization {
    public static void main(String[] args) {
        /*try {
            forest a = new forest("bruno", 10, "India");
            FileOutputStream fOut = new FileOutputStream("horse.txt");
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);
            oOut.writeObject(a);
            oOut.close();
            fOut.close();
            System.out.println("Serialization is done ");
        }catch (IOException exception){
            exception.printStackTrace();
        }*/


        try {
            FileInputStream fInput = new FileInputStream("forest.txt");
            ObjectInputStream oOut = new ObjectInputStream(fInput);
            forest animal = (forest) oOut.readObject();
            oOut.close();
            fInput.close();
            System.out.println("Deserialization is completed ");
            System.out.println("name : " + animal.name );
            System.out.println("age : " + animal.age);
            System.out.println("country : " + animal.country);
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
class forest implements Serializable{
    String name ;
    int age ;
    String country;
    forest(String name , int age , String country){
        this.name = name ;
        this.age = age;
        this.country = country;
    }
}
