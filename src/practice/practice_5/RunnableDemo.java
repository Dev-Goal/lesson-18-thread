package practice.practice_5;

public class RunnableDemo implements Runnable{
    private Thread thread;
    private final String threaname;

    public RunnableDemo(String threaname) {
        this.threaname = threaname;
        System.out.println("Creating " + threaname);
    }

    @Override
    public void run() {
        System.out.println("Running " + threaname);
        try {
            for (int i = 4; i > 0 ; i--) {
                System.out.println("Thread: " + threaname + ", " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threaname + " interrupted");
        }
        System.out.println("Thread " + threaname + " exiting");
    }

    public void start() {
        System.out.println("Starting " + threaname);
        if (thread == null) {
            thread = new Thread(this, threaname);
            thread.start();
        }
    }
}
