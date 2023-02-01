package TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws Exception {

        String sentence;
        String editedSentence;

        System.out.print("Enter the String : ");

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        Socket s = new Socket("localhost", 6699);

        

        DataOutputStream d = new DataOutputStream(s.getOutputStream());

        BufferedReader inFormServer = new BufferedReader(new InputStreamReader(s.getInputStream()));

        sentence = inFormServer.readLine();
        d.writeBytes(sentence);
        editedSentence = inFormServer.readLine();
        
        System.out.println("From Server : " + editedSentence);

        s.close();

    }
}
