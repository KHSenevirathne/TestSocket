package TCP;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class TCPServer {
    public static void main(String[] args) {
        String clientSentence;
        String capitalizedSentence;

        try {
            ServerSocket socket = new ServerSocket(6699);
            System.out.println("Server Side Started.");

            
            while (true) {
                Socket s = socket.accept();
                System.out.println("Connection Established");
                System.out.println("Getting Client Data");

                BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));

                DataOutputStream d = new DataOutputStream(s.getOutputStream());

                clientSentence = b.readLine();
                capitalizedSentence = clientSentence.toUpperCase();

                d.writeBytes(capitalizedSentence);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
