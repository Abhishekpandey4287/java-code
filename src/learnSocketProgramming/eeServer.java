package learnSocketProgramming;
import java.io.*;
import java.net.*;

public class eeServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = din.readUTF();
            System.out.println(str);
            ss.close();
        }catch (IOException  exception){
            exception.printStackTrace();
        }
    }
}
