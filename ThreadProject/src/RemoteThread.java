public class RemoteThread implements Runnable {
    @Override
    public void run() {

        p2();
        p3();
    }
    public void p2()
       {
       System.out.println("p2");
       }
       public void p3()
       {
           System.out.println("p3");
       }

}
