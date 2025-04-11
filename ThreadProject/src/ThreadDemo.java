//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // we pass Runnable ref to the thread beacause of 2 reason 1-Thread Run mETHOD missing 2-we cannot use thread and runabale together nd create problems
         //error isolation
        // clean code
        // confusion is created run method of thread and run method of runnable
        // ambi

           Thread t1 = new Thread(new UiThread());
            Thread t2= new Thread(new RemoteThread());
            //Runable t1 = new Runable
          //  t1.setName("UiThread");
        // t2.setName("Remote Thread");
            t1.start();
            t2.start();
            try{
                t1.join();
                t2.join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            p56();

       }

     public static void p56() {
        System.out.println("p56");
     }
//    public void run()
//    {
//        System.out.println(Thread.currentThread().getName());
//        if(Thread.currentThread().getName().equals("UiThread"))
//        {
//            p1();
//            p4();
//        }
//        else
//        {
//            p2();
//            p3();
//        }
//
//    }
//        public void p1()
//        {
//            System.out.println("p1");
//        }
//        public void p2()
//        {
//            System.out.println("p2");
//        }
//        public void p3()
//        {
//            System.out.println("p3");
//        }
//        public void p4()
//        {
//            System.out.println("p4");
//        }

}