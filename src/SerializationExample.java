import java.io.*;

/*class Student implements Serializable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}*/

public class SerializationExample {
    public static void main(String[] args) {
     /*  *//* // Serialization
        try {
            Student student = new Student("John", 20);
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Student object serialized and saved to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }*//*

        // Deserialization
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student student = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Student:");
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/













       /* try {
            Student s = new Student("Abhishek", 41, 22);
            FileOutputStream fOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fOut);
            out.writeObject(s);
            out.close();
            fOut.close();
            System.out.println("serialization successfull");
        }catch (IOException exception){
            exception.printStackTrace();
        }*/


        try {
            FileInputStream fInput = new FileInputStream("Student.st");
            ObjectInputStream oInput = new ObjectInputStream(fInput);
            Student s = (Student) oInput.readObject();
            oInput.close();
            fInput.close();
            System.out.println("Deserialization is successfull");
            System.out.println(s.age + " : age ");
            System.out.println(s.id + "  : id ");
            System.out.println(s.name + "  : name ");
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
class Student implements Serializable{
    int age ;
    int id;
    String name;

    public Student(String name , int id, int age){
        this.age= age;
        this.name = name ;
        this.id = id;
    }
}

