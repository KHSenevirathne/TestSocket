import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        
        try {
            System.out.println("Client Started");
            Socket s = new Socket("localhost",9806);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
