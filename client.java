import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            // Connects to the server on localhost at port 7011
            Socket socket = new Socket("localhost", 7011);
            
            // Sets up the output stream to send data
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            
            // Sends the message
            dout.writeUTF("Client Call!!");
            dout.flush();
            
            // Closes the connection
            dout.close();
            socket.close();
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
