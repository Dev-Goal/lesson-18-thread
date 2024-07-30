package excercise.excercise_9;

public class OddThread extends Thread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("OddNumber " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.err.println("OddThread interrupted. Number " + i);
            }
        }
    }
}
