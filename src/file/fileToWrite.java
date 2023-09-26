package file;
import java.io.FileWriter;

public class fileToWrite {
    public static void main(String[] args) {
        try {
            String name = "Abhishek";
            String bio = " if you are looking for the great developer you are in the right path";
            FileWriter file = new FileWriter("house.txt");
            file.write(name);
            file.write(bio);
            file.close();
            System.out.println("written file successfully");

        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
