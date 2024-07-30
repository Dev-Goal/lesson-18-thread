package excercise.excercise_9;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        evenThread.start();
    }
}
