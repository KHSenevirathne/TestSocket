package TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws Exception {

        String sentence;
        String editedSentence;

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        Socket s = new Socket("localhost", 6699);

        System.out.println("Enter the String : ");

        DataOutputStream d = new DataOutputStream(s.getOutputStream());

        BufferedReader inFormServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }
}
