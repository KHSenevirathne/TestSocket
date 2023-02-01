package TCP2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    
    public static void main(String[] args) throws Exception {
        
        String clientSentence;
        String capitalizedSentence;

        ServerSocket socket = new ServerSocket(6609);
        System.out.println("Server Started.");

        while (true) {
            Socket s = socket.accept();
            System.out.println("Connetion Established.");
            System.out.println("Waiting for Client");

            BufferedReader fromClient = new BufferedReader(new InputStreamReader(s.getInputStream()));

            clientSentence = fromClient.readLine();
            capitalizedSentence = clientSentence.toUpperCase();

            DataOutputStream toClient = new DataOutputStream(s.getOutputStream());

            toClient.writeBytes(capitalizedSentence);

        }
        
    }
    
}
