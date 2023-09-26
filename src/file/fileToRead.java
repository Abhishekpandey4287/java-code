package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileToRead {
    public static void main(String[] args) {
        try {
            File file = new File("house.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String data = in.nextLine();
                System.out.println(data );
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
