package excercise.excercise_9;

public class EvenThread extends Thread implements Runnable{
    @Override
    public void run() {
        for (int i = 2; i < 10; i += 2) {
            System.out.println("EvenNumber " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                System.err.println("EvenThread interrupted. Number " + i);
            }
        }
    }
}
