public class UiThread implements Runnable {
    public void run() {
       p1();
       p4();
    }
    public void p1()
    {
        System.out.println("p1");
    }


    public void p4()
    {
        System.out.println("p4");
    }
}
