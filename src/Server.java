import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) {

        try {
            System.out.println("Waiting for clients requests");
            ServerSocket socket = new ServerSocket(9806);
            Socket s = socket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Connection is Established");
    }
}