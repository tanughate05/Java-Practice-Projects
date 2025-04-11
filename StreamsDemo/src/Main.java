import java.io.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

     //   String data ="ghjhjhjkll";
   // Decorator design pattern
    FileOutputStream fout = new FileOutputStream("Sfile.txt",true);
   BufferedOutputStream bout = new BufferedOutputStream(fout);
   ObjectOutputStream oout = new ObjectOutputStream(bout);
   Account ref = new Account(1,"hella",2000);
   oout.writeObject(ref);
  // DataOutputStream dout = new DataOutputStream(bout);
      // dout.writeUTF(data);
   //fout.write(66);
     //   byte[] StreamString = data.getBytes();
    //fout.write(StreamString);

      bout.close();
       fout.close();


        }
    }
