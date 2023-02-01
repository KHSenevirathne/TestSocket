package TCP2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class TCPClient {
    public static void main(String[] args) throws Exception {
        String sentence;
        String newSentence;

        BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String : ");
        sentence = fromUser.readLine();

        Socket s = new Socket("localhost", 6609);

        DataOutputStream toServer =  new DataOutputStream(s.getOutputStream());
        toServer.writeBytes(sentence);

        BufferedReader fromServer =  new BufferedReader(new InputStreamReader(s.getInputStream()));
        
        newSentence = fromServer.readLine();

        System.out.println("From Server : " + newSentence);

        

    }

}
