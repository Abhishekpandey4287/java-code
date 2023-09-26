package learnSocketProgramming;

import java.io.*;
import java.io.IOException;
import java.net.*;

public class eeClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dOut = new DataOutputStream(s.getOutputStream());
            dOut.writeUTF("hii");
            System.out.println("connection is established");
            dOut.flush();
            dOut.close();
            s.close();

        }catch (IOException  exception){
            exception.printStackTrace();
        }
    }
}
