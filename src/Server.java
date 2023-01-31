import java.io.IOException;
import java.net.ServerSocket;

public class Server{
    public static void main(String[] args) {

        try {
            System.out.println("Waiting for clients requests");
            ServerSocket socket = new ServerSocket(9806);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}