import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    
    public static void main(String[] args) throws Exception {
        
        String clientSentence;
        String capitalizedSentence;

        System.out.println("Waiting for clients");

        ServerSocket welcomeSocket = null;

        try{
            welcomeSocket = new ServerSocket(9806);

            while (true) {
            
                Socket connectionSocket = welcomeSocket.accept();
                System.out.println("Connection is establish");

                System.out.println("Getting Client Data");

                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

                clientSentence = inFromClient.readLine();

                capitalizedSentence = clientSentence.toUpperCase();

                outToClient.writeBytes(capitalizedSentence);
            }

        } finally {
            if(welcomeSocket != null){
                welcomeSocket.close();
            }
        }
    }
}
