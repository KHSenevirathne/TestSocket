import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        
        try {
            System.out.println("Server Side Started.");
            ServerSocket socket = new ServerSocket(6609);
            Socket s = socket.accept();
            System.out.println("Connection Established.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
