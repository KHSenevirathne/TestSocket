import java.io.IOException;
import java.net.Socket;


public class Client {
    public static void main(String[] args) {
        
        try {
            Socket s = new Socket("localhost",6690);
            System.out.println("Client Side Started");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
