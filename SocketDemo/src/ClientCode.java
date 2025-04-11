import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientCode {
    public static void main(String[] args) throws IOException {
        String data ="Clint sys hi";
        Socket sender = new Socket(InetAddress.getByName("localhost"),20000);
        DataOutputStream  dout = new DataOutputStream(sender.getOutputStream());
        dout.writeUTF(data);
        dout.close();

    }
}
