import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCode {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(20000);
        Socket Receiver = server.accept();
        DataInputStream din = new DataInputStream(Receiver.getInputStream());
        String value =din.readUTF();
        System.out.println(value);
    }
}
